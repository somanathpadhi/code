package programs.kotlin_codes

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flatMapConcat
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flatMapMerge
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main() = runBlocking{
    myMap()
    flatMap()

    flatMapConcat() // Concat = sequential
    flatMapMerge() // Merge = multiple flows run concurrently
    flatMapLatest()
}

fun myMap(){
    val mappedValues = (1..3).map { it *2 }
    print(mappedValues)
}

fun flatMap(){
    val listOfList = listOf(listOf(1,2,3), listOf(3,4,5))
   val flattened =  listOfList.flatMap { it }
    print(flattened)
}

@OptIn(ExperimentalCoroutinesApi::class)
suspend fun flatMapConcat(){
    (1..3).asFlow().onEach { delay(100.milliseconds) }
        .flatMapConcat { getFlow(it) }
        .collect {
            println(it)
        }
}@OptIn(ExperimentalCoroutinesApi::class)
suspend fun flatMapMerge(){
    (1..3).asFlow().onEach { delay(100.milliseconds) }
        .flatMapMerge { getFlow(it) }
        .collect {
            println(it)
        }
}
@OptIn(ExperimentalCoroutinesApi::class)
suspend fun flatMapLatest(){
    (1..3).asFlow().onEach { delay(100.milliseconds) }
        .flatMapLatest { getFlow(it) }
        .collect {
            println(it)
        }
}


fun getFlow(int: Int)= flow{
    emit("first emit $int")
    delay(500.milliseconds)
    emit("second emit $int")
}