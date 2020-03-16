package com.github.moonllit.githubclient.data.entity

import com.google.gson.annotations.SerializedName

typealias DomainUser = com.github.moonllit.githubclient.domain.usecase.entity.User

data class User(
    @field:SerializedName("login")
    val login: String,
    @field:SerializedName("id")
    val id: Int,
    @field:SerializedName("avatar_url")
    val avatar: String?
)

val UserEntityMapper: suspend List<User>.() -> List<DomainUser> = {
    map {
        DomainUser(it.login, it.id, it.avatar ?: "")
    }
}
