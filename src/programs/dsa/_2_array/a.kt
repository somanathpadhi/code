package programs.dsa._2_array

fun makeArray(array: IntArray): MutableList<Int> {
    var sum = 1
    var arr = mutableListOf<Int>()

    for (item in array){
        sum *= item
    }
    for (item in array){
        arr.add(sum/item)
    }
    return arr
}