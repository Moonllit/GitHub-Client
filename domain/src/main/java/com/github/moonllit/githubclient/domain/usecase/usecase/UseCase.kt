package com.github.moonllit.githubclient.domain.usecase.usecase

import kotlinx.coroutines.flow.Flow

abstract class UseCase<out Type, in Params> where Type : Any {

    abstract suspend fun run(params: Params): Flow<Type>

    suspend operator fun invoke(params: Params): Flow<Type> {
        return run(params)
    }
}
