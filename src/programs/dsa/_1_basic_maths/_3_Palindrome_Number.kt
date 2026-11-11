package programs.dsa._1_basic_maths

import kotlin.math.abs

fun reverse(x: Int): Int {
    var tempX = abs(x)
    var rev = 0
    while(tempX > 0){
        val rem = tempX % 10
        if (rev > (Int.MAX_VALUE - rem) / 10 ) return 0
        rev = rev * 10 + rem
        tempX /= 10
    }
    return if(x < 0) -rev else rev
}
fun main() {
    print(reverse(456))
}