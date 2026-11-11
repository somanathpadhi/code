package programs.dsa._2_array

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 6)
    println(occurrence(array))
}

fun occurrence(array: IntArray):HashMap<Int,Int> {
    val hm = HashMap<Int,Int>()
    for (no in array){
        hm[no] = (hm[no] ?: 0) + 1
    }
    return hm
}