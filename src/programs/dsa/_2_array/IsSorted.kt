package programs.dsa._2_array


fun main() {
    val array = intArrayOf(1, 2, 3, 4, 6)
    println(isSorted(array))
}
fun isSorted(array: IntArray): Boolean {
    for (i in 1..array.size - 1) {
        if (array[i] < array[i - 1]) {
            return false
        }
    }
    return true
}