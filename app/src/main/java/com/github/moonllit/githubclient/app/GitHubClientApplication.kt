package com.github.moonllit.githubclient.app

import android.app.Application
import com.github.moonllit.githubclient.data.di.networkModule
import com.github.moonllit.githubclient.data.di.repositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class GitHubClientApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@GitHubClientApplication)
            modules(listOf(networkModule, repositoryModule))
        }
    }
}
