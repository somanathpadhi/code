package programs.kotlin_codes

//var means the value can be reassigned later
//Use it when the value needs to change over time

fun main() {
    var age = 25
    age = 24
    print(age)
}

//val means the value is fixed once assigned
//Like final in Java
//fixed but decided at runtime, its value is calculated when the program runs, not before

fun value(){
    val age = 24
}



//const val — Compile-time Constant
//Must be a primitive type or String (Int, String, Boolean, etc.)
//Must be declared at the top level or inside an object — not inside a function

const val PI = 0

class Variables{
    companion object{
        const val C = 23
    }
}