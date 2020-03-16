package com.github.moonllit.githubclient.domain.usecase.usecase.users

import com.github.moonllit.githubclient.domain.usecase.entity.User
import com.github.moonllit.githubclient.domain.usecase.repository.UserRepository
import com.github.moonllit.githubclient.domain.usecase.usecase.UseCase
import kotlinx.coroutines.flow.Flow

class GetUsersUseCase(
    private val userRepository: UserRepository
) : UseCase<List<User>, Nothing>() {

    override suspend fun run(params: Nothing): Flow<List<User>> {
        return userRepository.getAllUsers()
    }
}
