package programs.dsa._2_array



fun main() {
    println(reverseArray(arrayOf(1, 2, 3, 4, 5)).contentToString())

}

//Reverse an Array
fun reverseArray(arr: Array<Int>): Array<Int> {
    var f = 0
    var l = arr.lastIndex

    while (f < l) {
        val temp = arr[f]
        arr[f] = arr[l]
        arr[l] = temp

        f++
        l--
    }
    return arr
}