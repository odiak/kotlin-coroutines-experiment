package net.odiak.kotlin_coroutines_experiment

import kotlinx.coroutines.*

suspend fun s1(): Int {
    println("hello")
    delay(1000L)
    println("world")
    return 42
}

fun main(args: Array<String>) {
    runBlocking {
        println(s1())
    }
}
