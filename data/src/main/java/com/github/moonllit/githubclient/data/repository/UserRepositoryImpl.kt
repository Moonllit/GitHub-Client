package com.github.moonllit.githubclient.data.repository

import com.github.moonllit.githubclient.data.api.GithubService
import com.github.moonllit.githubclient.data.entity.UserEntityMapper
import com.github.moonllit.githubclient.domain.usecase.entity.User
import com.github.moonllit.githubclient.domain.usecase.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class UserRepositoryImpl(
    private val service: GithubService
) : UserRepository {

    override suspend fun getAllUsers(): Flow<List<User>> {
        return service.getAllUsers().map(UserEntityMapper)
    }
}
