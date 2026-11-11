package programs.dsa._1_basic_maths

import kotlin.math.abs

fun main() {
    val number = -1234
    print(reverseANumber(number))
}

fun reverseANumber(no: Int): Int {
    var tempNo = abs(no)
    var rev = 0
    while (tempNo > 0) {
        val rem = tempNo % 10
        // Check overflow BEFORE multiplying
        if (rev > (Int.MAX_VALUE - rem) / 10) return 0
        rev = rev * 10 + rem
        tempNo /= 10
    }
    return if (no < 0) -rev else rev
}