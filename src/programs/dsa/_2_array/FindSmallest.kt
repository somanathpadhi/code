package programs.dsa._2_array

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 6)
    println(smallest(array))
}

fun smallest(array: IntArray): Int {
    var smallest = Int.MAX_VALUE
    for (no in array) {
        if (no < smallest) {
            smallest = no
        }
    }
    return smallest
}
