package com.example.lib

import kotlinx.coroutines.*

internal actual val ApplicationDispatcher: CoroutineDispatcher = Dispatchers.Default