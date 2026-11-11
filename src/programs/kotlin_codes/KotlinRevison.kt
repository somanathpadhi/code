package programs.kotlin_codes

import kotlin.collections.iterator
import kotlin.properties.Delegates
import kotlin.reflect.KProperty
import kotlin.time.Duration
import kotlin.time.Duration.Companion.hours



class Run {
    val obj = object {
        val AGE = 30
    }

}
//fun programs.kotlin_codes.run..main() {
//    val name = "somanath"
//    var str = "Prashant"
//    var age = 6
//    age += 2
//    age += 1
//
//  // programs.kotlin_codes.collectionList()
//   // programs.kotlin_codes.loops()
//
//    //programs.kotlin_codes.nullable()
//    print("soma".programs.kotlin_codes.myStyle())
//}

fun collectionList() {
    var immutable = listOf<Int>(1, 2, 3)
    var arrayList = arrayListOf<Int>(2, 3, 4)
    var mutable2 = mutableListOf(4, 6, 9)
    println(mutable2.filter { x -> x > 3 }.map { it * 2 })
    //  mutable2.programs.kotlin_codes.add(3)
    println(mutable2)

    var immutableSet = setOf(1, 2, 3, 3)
    var mutableSet = mutableSetOf(1, 3)
    mutableSet.add(4)
    println(mutableSet)

    var immutableMap = mutableMapOf(1 to "a", 2 to 'b')
    println(immutableMap)
    println(immutableMap.entries)
    println(immutableMap.values)
}

fun loops() {
    for (i in 4 downTo 0) {
        print(i)
    }
    namedArgument(name = "H")
    higherOrderFn(::add)
    val upperCaseString = { text: String -> text.uppercase() }
    println({ text: String -> text.uppercase() }("somhhg"))

}


fun higherOrderFn(fn: (Int, Int) -> Int): (Int, Int) -> Int {
    return fn
}


fun add(a: Int, b: Int): Int {
    return a + b

}

fun namedArgument(name: String = "Somanath") {

}

fun nullable() {
    var age: String? = null
    print(age?.map { it to "d" })
    println(age ?: "NA")


}

fun String.myStyle(): String {
    return "_____${this}_____"
}

fun scopeFun() {
    val name: String? = "S"

    // 1. let
    // Uses: it
    // Returns: Last expression
    // Common use: Null check, transformation
    name?.let {
        println("let -> $it")
        println("Length = ${it.length}")

        // Last expression is returned
        it.uppercase()
    }

    // 2. run
    // Uses: this
    // Returns: Last expression
    val runResult = name.run {
        println("run -> $this")

        if (this != null) {
            println("Length = ${length}")
            uppercase()
        } else {
            "NULL"
        }
    }

    println("runResult = $runResult")

    // 3. with
    // Uses: this
    // Returns: Last expression
    val withResult = with(name) {
        println("with -> $this")

        if (this != null) {
            println("Length = $length")
            lowercase()
        } else {
            "NULL"
        }
    }

    println("withResult = $withResult")

    // 4. apply
    // Uses: this
    // Returns: Receiver object
    val applyResult = name?.apply {
        println("apply -> $this")
        println("Length = $length")

        // You normally configure mutable objects here.
        // String is immutable, so we can only read it.
    }

    println("applyResult = $applyResult")

    // 5. also
    // Uses: it
    // Returns: Receiver object
    val alsoResult = name.also {
        println("also -> $it")

        if (it != null) {
            println("Length = ${it.length}")
        }
    }

    println("alsoResult = $alsoResult")
}



sealed class Results {
    data object Loading : Results()
    data class success(val data: String) : Results()
    data class Error(val message: String) : Results()
}


sealed class Result<out T> {

    data object Loading : Result<Nothing>()
    data class Success<T>(val data: T) : Result<T>()

    data class Error(val message: String) : Result<Nothing>()
}

class Contact(val id: Int, fName: String, lName: String) {
    var name: String = fName
        get() {
            return "Hello $field"
        }
        set(value) = run {
            println("Before value $value")
            println("Before field $field")
            field = value
            println("After value $value")
            println("After field $field")
        }
    var fullName: String = "$fName $lName"

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("Getting ${property.name}")
        return name
    }

    operator fun setValue(
        thisRef: Any?,
        property: KProperty<*>,
        newValue: String
    ) {
        println("Setting ${property.name} = $newValue")
        name = newValue
    }

}


val String.lastChar: Char
    get() = this[this.length - 1]

val String.wordCount: Int
    get() = this.split(" ").size


class Delegate {

    private var value = ""

    fun name(){
        print(value::class.simpleName)
    }

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("Getting ${property.name}")
        return value
    }

    operator fun setValue(
        thisRef: Any?,
        property: KProperty<*>,
        newValue: String
    ) {
        println("Setting ${property.name} = $newValue")
        value = newValue
    }
}

class Temperature {
    var temp: Double by Delegates.vetoable(20.5) { _, oldValue, newValue ->
        if (newValue > 25) {
            print("temp is too hot!  $oldValue -> $newValue")
            false
        } else {
            print("temp change $oldValue -> $newValue")
            true
        }
    }
}

typealias myStringAlias = String
//fun programs.kotlin_codes.run..main() {
////    val temp = programs.kotlin_codes.Temperature()
////    println(temp.temp)
////    temp.temp = 27.6
////    println()
////    println(temp.temp)
//
//
////    println(programs.kotlin_codes.maxOf(3,5))
////    var fruitList = listOf("apple","mango","orange")
////    for (fruit in fruitList){
////        println(fruit)
////        for (fruit in fruitList.indices){
////            println(fruit)
////        }
////    }
////
////    outer@ for (i in 0..10){
////        inner@ for (j in 0..10){
////            print(j)
////            break@inner
////        }
////        break@outer
////    }
////    val x = 0
////    val y = 10
////    if (x in 1..y+1) {
////        println("fits in range")
////        parseInt("4")
////    }
//    val p = programs.kotlin_codes.Person("s",3)
//    println(p)
//
//
//}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun maxOf(a: Int, b: Int): Int{
    if (a > b){return  a}
    else return  b
}
fun maxOf2(a: Int, b: Int) = if (a > b) a else b


data class  Person(val name: String, val id: Int){

    constructor(id: Int):this(name = "",id = id)
    constructor(name: String):this(name = name,id = 0)
    init {
        print(name)
    }

}
class Person2(name: String) {

    val c = "s"
    companion object{
        val PI = 8
        fun printData(){
            print(PI)

        }
    }

    val fullName = run {
        println("1. Property initializer")
        name
    }

    init {
        println("2. First init block")
    }

    init {
        println("3. Second init block")
    }

    constructor(name: String, age: Int) : this(name) {
        println("4. Secondary constructor")
    }
}

fun main() {
  val user = User("Soma",Address("BLR"))
    println("user $user")
    val copiedUser = user.copy(address = user.address.copy())
    copiedUser.address.city = "Mumbai"
    println("user $user")
    println("copied user $copiedUser")
    val map = mapOf(1 to "a",2 to "b")
    println(map)
    for ((key,value) in map){
        println("key $key value $value")
    }
    println(map[1])

    val abstractInstantiation = object : Ab(){
        override fun doTask() {
           print("do task")
        }
    }
    abstractInstantiation.doTask()
    emptyList<Int>()

    val stringPlus: (String, String) -> String = String::plus
    val intPlus: Int.(Int) -> Int = Int::plus

    println(stringPlus.invoke("<-", "->"))
    println(stringPlus("Hello, ", "world!"))

    println(intPlus.invoke(1, 1))
    println(intPlus(1, 2))
    println(2.intPlus(3)) // extension-like call

    val halfHour: Duration = 0.5.hours
}

abstract class Ab{
    abstract fun doTask()
}



data class Address(var city: String){

}
data class User(val name: String,val  address: Address){

}
fun singleExpressionFun() = 43

val hasErrors = true
val hasWarnings = true
val isComplete = false

// buildString creates an empty buffer
val status = buildString {
    // Appends "Errors found" to the buffer
    if (hasErrors) append("Errors found")
    if (hasWarnings) {
        // The buffer is not empty, appends "; "
        if (isNotEmpty()) append("; ")
        // Appends "Warnings found"
        append("Warnings found")
    }
    // programs.kotlin_codes.isComplete = false, nothing to append
    if (isComplete) {
        if (isNotEmpty()) append("; ")
        append("Completed")
    }
    // The buffer is not empty, skips the fallback
    if (isEmpty()) append("OK")
}


// Errors found; Warnings found











