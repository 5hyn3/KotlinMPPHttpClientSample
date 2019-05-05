package com.example.jsonplaceholder.api

import com.example.jsonplaceholder.model.User
import com.example.lib.httpClient.MyHttpClient
import kotlinx.serialization.json.Json

internal class UserApi {
    suspend fun getUser(userId: Long): User {
        val url = "https://jsonplaceholder.typicode.com/users/$userId"
        val response = MyHttpClient.get(url)
        return  Json.nonstrict.parse(User.serializer(), response)
    }
}