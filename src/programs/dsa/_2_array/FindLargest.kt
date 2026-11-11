package programs.dsa._2_array

fun main() {
    val array = intArrayOf(1,2,3,4,6)
    // println(findLargest(array))
    //println(reverseArray(array).contentToString())
    println(arraySortedCheck(array))

}

fun findLargest(array: IntArray): Int {
    var largest = Int.MIN_VALUE

    for (number in array) {
        if (number > largest) {
            largest = number
        }
    }
    return largest
}

fun reverseArray(array: IntArray): IntArray {
    var f = 0
    var l = array.size - 1
    while (f < l) {
        val temp = array[f]
        array[f] = array[l]
        array[l] = temp
        f++
        l--
    }
    return array
}

fun arraySortedCheck(array: IntArray): Boolean {
    for (i in 1..<array.size) {
        if (array[i] < array[i - 1]) {
            return false
        }
    }
    return true
}

