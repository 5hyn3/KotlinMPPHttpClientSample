package com.example.lib.coroutine

import kotlinx.coroutines.runBlocking

internal actual fun <T> runBlocking(block: suspend () -> T) {
    runBlocking { block() }
}