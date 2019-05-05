package com.example.lib.coroutine

import com.example.lib.ApplicationDispatcher

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

fun <T> async(block: suspend CoroutineScope.() -> T) = GlobalScope.async(ApplicationDispatcher) {
    block()
}

internal expect fun <T> runBlocking(block: suspend () -> T)