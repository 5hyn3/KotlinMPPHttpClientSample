package com.example.lib

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.url
import io.ktor.client.response.HttpResponse
import io.ktor.client.response.readText
import com.example.lib.coroutine.runBlocking
import kotlin.test.Test

class HttpClientTest {
    private val client = HttpClient()
    @Test
    fun test() {
        runBlocking {
            val response = client.get<HttpResponse> {
                url("https://jsonplaceholder.typicode.com/users")
            }
            println(response.readText())
        }
    }
}