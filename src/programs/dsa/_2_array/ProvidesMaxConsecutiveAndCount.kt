package programs.dsa._2_array

import java.util.TreeSet
import kotlin.math.abs

fun main() {

//[100,2,3,1,4,200] -> 4(1,2,3,4)
//[100,2,3,1,4,200,101,102,103,104,105] -> 6(100....105)
    val intArray = intArrayOf(100,2,3,1,4,200)
    print (providesMaxConsecutiveAndCount(intArray))
}

fun providesMaxConsecutiveAndCount(intArray: IntArray): Int {
    val treeSet: TreeSet<Int> = TreeSet()
    for (item in intArray) {
        treeSet.add(item)
    }
    val list = treeSet.toList()
    var maxConsecutive = 0
    var currentTotal = 1
    for (index in 0..<list.size -1) {

        if (abs( list[index] - list[index + 1]) == 1) {
            currentTotal += 1
            if (maxConsecutive < currentTotal){
                maxConsecutive = currentTotal
            }

        } else {
            currentTotal = 1
        }
    }
    return maxConsecutive
}