package com.example.lib.httpClient

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.url
import io.ktor.client.response.HttpResponse
import io.ktor.client.response.readText
import kotlin.native.concurrent.ThreadLocal

@ThreadLocal
object MyHttpClient {
    private val client = HttpClient()

    internal suspend fun get(url: String): String {
        val response = client.get<HttpResponse> {
            url(url)
        }
        return response.readText()
    }
}