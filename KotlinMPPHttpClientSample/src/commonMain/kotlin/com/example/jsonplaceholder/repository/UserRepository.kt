package com.example.jsonplaceholder.repository

import com.example.jsonplaceholder.api.UserApi
import com.example.lib.coroutine.async

class UserRepository {
    fun getUserAsync(userId: Long) = async {
        UserApi().getUser(userId)
    }
}