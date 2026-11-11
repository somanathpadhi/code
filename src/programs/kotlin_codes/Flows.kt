package programs.kotlin_codes

import kotlinx.coroutines.flow.count
import kotlinx.coroutines.flow.drop
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.fold
import kotlinx.coroutines.flow.last
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.reduce
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.flow.transform
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {

    val flow = flow {
        emit(1)
        emit(2)
        emit(3)
    }

    //Terminal Operators
    flow.collect { print(it) }// to collect emission
        // alternate for collect ⬇️
    //flow.onEach { print(it) }.launchIn(this)

    val list = flow.toList()
    val first = flow.first()
    val last = flow.last()
    val sum1 = flow.reduce { accumulator, value ->  accumulator + value}
    val sum2 = flow.fold(3){acc, value -> acc + value}
    val count = flow.count()
    //flow.onEach { print(it) }.launchIn(this)
    //println()
    //println(count)

    //Intermediate Operators
    val mappedFlow = flow.map{ it * 2 }
    val filteredFlow = flow.filter { it > 2 }
    val take = flow.take(2)
    val drop = flow.drop(2)

    val transformed = flow.transform {
        print(it)
        emit(it)
    }

}



