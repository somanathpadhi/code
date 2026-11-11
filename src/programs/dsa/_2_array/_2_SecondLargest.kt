package programs.dsa._2_array


fun main() {
    println(_root_ide_package_.programs.dsa._1_array.secondLargest(arrayOf(3, 5, 7, 4, 2, 7)))
}
//second largest

fun secondLargest(arr: Array<Int>): Int {
    var firstL = Int.MIN_VALUE
    var secondL = Int.MIN_VALUE

    for (no in arr) {
        if (no > firstL) {
            secondL = firstL
            firstL = no
        } else if (no > secondL && no < firstL) {
            secondL = no
        }
    }
    return secondL
}
