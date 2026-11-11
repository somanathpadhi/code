package programs.dsa._2_array


fun main() {
    println(_root_ide_package_.programs.dsa._1_array.secondSmallest(intArrayOf(3, 5, 7, 4, 2, 7)))
}

fun secondSmallest(array: IntArray): Int {
    var firstS = Int.MAX_VALUE
    var secondS = Int.MAX_VALUE
    for (no in array) {
        if (no < firstS) {
            secondS = firstS
            firstS = no
        } else if (no < secondS && no > firstS) {
            secondS = no
        }
    }
    return secondS
}