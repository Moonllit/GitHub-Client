package com.github.moonllit.githubclient.domain.usecase.repository

import com.github.moonllit.githubclient.domain.usecase.entity.User
import kotlinx.coroutines.flow.Flow

interface UserRepository {

    suspend fun getAllUsers(): Flow<List<User>>
}
