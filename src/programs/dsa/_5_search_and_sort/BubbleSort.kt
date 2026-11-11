package programs.dsa._5_search_and_sort

fun main() {
    val list = intArrayOf(1, 3, 5, 7, 2, 4, 6)
    println(_root_ide_package_.programs.dsa._4_search_and_sort.insertionSort(list).contentToString())

}

fun insertionSort(intArray: IntArray): IntArray {
    for (i in 1..intArray.size - 1) {
        val current = intArray[i]
        var prev = i - 1

        while (prev >= 0 && current < intArray[prev]) {
            intArray[prev + 1] = intArray[prev]
            prev--
        }
        intArray[prev + 1] = current
    }
    return intArray
}


fun selectionSort(intArray: IntArray): IntArray {
    for (i in 0..intArray.size - 1) {
        var smallest = i
        for (j in i + 1..intArray.size - 1) {
            if (intArray[j] < intArray[smallest]) {
                smallest = j
            }
        }
        val temp = intArray[smallest]
        intArray[smallest] = intArray[i]
        intArray[i] = temp
    }
    return intArray
}


fun bubbleSort(intArray: IntArray): IntArray {
    for (i in 0..intArray.size - 1) {
        for (j in 0..<intArray.size - 1 - i) {
            if (intArray[j] > intArray[j + 1]) {
                val temp = intArray[j]
                intArray[j] = intArray[j + 1]
                intArray[j + 1] = temp
            }
        }
    }
    return intArray
}

