package programs.dsa._2_array

fun main() {
    val intArray = intArrayOf(1, 2, 3, 4,3, 5, 6)
    println(_root_ide_package_.programs.dsa._1_array.linearSearch(intArray, 3))
    println(_root_ide_package_.programs.dsa._1_array.findFirstAndLastOccurrence(intArray, 3))
}

fun linearSearch(array: IntArray, item: Int): Boolean {
    for (number in array) {
        if (number == item) {
            return true
        }
    }
    return false
}
//Find the first and last occurrence
fun findFirstAndLastOccurrence(array: IntArray, target: Int): Pair<Int,Int>{
    var first = -1
    var last = 0
    for (i in array.indices){
        if (target == array[i]){
            if (first == -1){
                first = i
            }
            last = i
        }
    }
    return Pair(first,last)


}