package com.github.moonllit.githubclient.data.api

import com.github.moonllit.githubclient.data.entity.User
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubService {

    @GET("users")
    fun getAllUsers(@Query("since") sinceUserId: String = "1"): Flow<List<User>>
}
