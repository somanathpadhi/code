package programs.dsa._1_basic_maths

import kotlin.math.abs
import kotlin.math.log10

fun countDigits(digit: Int): Int {
    if (digit == 0) return 1
    var count = 0
    var digitTemp = abs(digit)
    while (digitTemp > 0) {
        count += 1
        digitTemp /= 10
    }
    return count
}

fun countDigit2(digit: Int): Int =
    abs(digit)
        .toString().length
        .also { if (digit == 0) return 1 }

fun countDigitsWithLog(digit: Int): Int{
    return (log10(abs(digit.toDouble())) +1).toInt()
}
fun main() {
    val digit = -546857
    print(countDigitsWithLog(digit))
}