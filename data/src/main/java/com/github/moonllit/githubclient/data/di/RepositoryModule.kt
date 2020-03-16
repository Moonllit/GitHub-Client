package com.github.moonllit.githubclient.data.di

import com.github.moonllit.githubclient.data.repository.UserRepositoryImpl
import com.github.moonllit.githubclient.domain.usecase.repository.UserRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<UserRepository> { UserRepositoryImpl(get()) }
}
