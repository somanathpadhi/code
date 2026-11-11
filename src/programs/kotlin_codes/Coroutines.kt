package programs.kotlin_codes

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

@OptIn(DelicateCoroutinesApi::class)
fun main() = runBlocking {

    launch {

        throw Exception("Crash")
    }

    val time = measureTimeMillis {
        val one = async(start = CoroutineStart.LAZY) { 10 }
        val two = async(start = CoroutineStart.LAZY) { 20 }
        // some computation
        one.start() // start the first one
        two.start() // start the second one
        println("The answer is ${one.await() + two.await()}")
    }
    println("Completed in $time ms")
    println("Main")
}