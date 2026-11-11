package programs.dsa._1_basic_maths

import kotlin.math.sqrt

fun main() {
    print(isPrime(9))
}

//Every factor above √36 is just a mirror of one below it. So checking up to 6 is enough.
fun isPrime(no:Int ): Boolean{
    if(no < 2) return false
    for (i in 2..sqrt( no.toDouble()).toInt()){
        if (no % i  == 0) return false
    }
    return true
}
