package programs.dsa._2_array

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 6)
    println(_root_ide_package_.programs.dsa._1_array.smallest(array))
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
