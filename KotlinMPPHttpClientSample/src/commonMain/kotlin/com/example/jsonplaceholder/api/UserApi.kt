package com.example.jsonplaceholder.api

import com.example.jsonplaceholder.model.User
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.url
import io.ktor.client.response.HttpResponse
import io.ktor.client.response.readText
import kotlinx.serialization.json.Json

internal class UserApi {
    suspend fun getUser(userId: Long): User {
        val endpoint = "https://jsonplaceholder.typicode.com/users/$userId"
        val response = HttpClient().get<HttpResponse> {
            url(endpoint)
        }.readText()
        return  Json.nonstrict.parse(User.serializer(), response)
    }
}