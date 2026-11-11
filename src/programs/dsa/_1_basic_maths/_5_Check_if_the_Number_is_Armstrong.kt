package programs.dsa._1_basic_maths

import kotlin.math.abs
import kotlin.math.log10

fun main() {
    print(_root_ide_package_.programs.dsa._basic_maths.checkIfTheNumberIsArmstrongWithLogOptimal(371))
}

fun checkIfTheNumberIsArmstrongWithLogOptimal(no: Int): Boolean{
    var tempNo = abs(no)
    var sum = 0
    val noOfDigits = (log10(tempNo.toDouble()) + 1).toInt()

    while (tempNo > 0){
        val digit = tempNo % 10
        sum = sum + Math.powExact(digit,noOfDigits)
        tempNo = tempNo / 10
    }
    return sum == no
}


fun checkIfTheNumberIsArmstrong(no: Int): Boolean{
    val power  = _root_ide_package_.programs.dsa._basic_maths.countDigitsForArmStrong(no)
    val result = _root_ide_package_.programs.dsa._basic_maths.calculate(no, power)
    return no == result

}

fun countDigitsForArmStrong(digit: Int): Int {
    if (digit == 0) return 1
    var count = 0
    var digitTemp = abs(digit)
    while (digitTemp > 0) {
        count += 1
        digitTemp /= 10
    }
    return count
}

fun calculate(no: Int, power: Int): Int {
    var tempNo = abs(no)
    var result = 0
    while (tempNo > 0) {
        val rem = tempNo % 10
        result = result + Math.pow(rem.toDouble(), power.toDouble()).toInt()
        tempNo /= 10
    }
    // Check overflow BEFORE returning
    result = if (result > Int.MAX_VALUE) return -1 else result

    return result
}