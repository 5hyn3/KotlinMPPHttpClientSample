package com.example.jsonplaceholder.model

import kotlinx.serialization.Serializable

@Serializable
data class User(
        val name: String
)