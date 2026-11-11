package programs.dsa._2_array


fun main() {
    val array = intArrayOf(1, 2, 3, 4, 6)
    println(_root_ide_package_.programs.dsa._1_array.isSorted(array))
}
fun isSorted(array: IntArray): Boolean {
    for (i in 1..array.size - 1) {
        if (array[i] < array[i - 1]) {
            return false
        }
    }
    return true
}