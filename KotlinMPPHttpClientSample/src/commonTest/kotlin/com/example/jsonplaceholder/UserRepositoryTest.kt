package com.example.jsonplaceholder

import com.example.jsonplaceholder.repository.UserRepository
import com.example.lib.coroutine.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals

class UserRepositoryTest {

    @Test
    fun getUser() {
        runBlocking{
            val user = UserRepository().getUserAsync(1).await()
            assertEquals("Leanne Graham", user.name, "The name of the user with ID 1 is Leanne Graham.")
        }
    }
}