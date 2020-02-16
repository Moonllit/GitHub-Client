package com.github.moonllit.githubclient.domain.usecase

import com.github.moonllit.githubclient.domain.usecase.result.Result
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

abstract class UseCase<in P, R> {
    private val backgroundContext: CoroutineContext = Dispatchers.IO
    private val foregroundContext: CoroutineContext = Dispatchers.Main

    private var parentJob: Job = Job()

    operator fun invoke(params: P, onResult: (Result<R>) -> Unit = {}) {
        unsubscribe()
        parentJob = Job()

        CoroutineScope(foregroundContext + parentJob).launch {
            val result = withContext(backgroundContext) {
                execute(params)
            }

            onResult(result)
        }
    }

    abstract fun execute(params: P): Result<R>

    private fun unsubscribe() {
        parentJob.apply {
            cancel()
            cancelChildren()
        }
    }
}
