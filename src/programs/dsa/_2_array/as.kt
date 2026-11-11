package programs.dsa._2_array

//lateinit var v: Double
//fun .main() {
//    val input1 = intArrayOf(1,2,3,3,4,5,6)
//    val input2 = intArrayOf(6,7,8,9,10)
//
//    //val result = compress(input)
//    //checkVowelsConsonants(input)
//    //println(checkOnlyDigits(input))
//    //moveAllZeros(input)
//
//   // println(mergeTwoSortedArray(input1,input2).contentToString())
//    val intArray = intArrayOf(1, 2, 3, 4, 5, 6, 7)
//    print(rotateK(intArray,3).contentToString())
//
//    // println(result)
//}

fun compress(str: String): String {

    if (str.isEmpty()) {
        return ""
    }

    var result = StringBuilder()
    var count = 1

    for (i in 1..str.length)
        if (i < str.length && str[i] == str[i - 1]) {
            count++
        } else {
            result.append(str[i - 1])
            result.append(count)
            count = 1
        }
    return result.toString()
}

//Count Vowels and Consonants
fun checkVowelsConsonants(str: String) {

    var vowels = 0
    var consonants = 0

    for (char in str) {
        if (char in "aeiouAEIOU") {
            vowels++
        } else {
            consonants++
        }
    }
    println("vowels are $vowels and consonants are $consonants")

}

//Check if String Contains Only Digits
fun checkOnlyDigits(str: String): Boolean {

    for (char in str) {
        if (char < '0' || char > '9') {
            return false
        }
    }
    return true
}


//Check if Array is Sorted
fun isArraySorted(arr: IntArray): Boolean {
    for (i in 1 until arr.size) {
        if (arr[i] < arr[i - 1]) {
            return false
        }
    }
    return true

}

//remove duplicate from a sorted array
fun removeDupFromSortedArray(arr: IntArray) {

    var j = 1
    for (i in 1..<arr.size) {
        if (arr[i] != arr[i - 1]) {
            arr[j] = arr[i]
            j++
        }
    }
    for (i in 0..<j) {
        print(arr[i].toString() + " ")
    }
}
//Move All Zeros to End

fun moveAllZeros(arr: IntArray) {


    var j = 0
    for (i in arr.indices) {
        if (arr[i] != 0) {
            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
            j++
        }
    }
    print(arr.contentToString())
}

fun moveAllZeros2(arr: IntArray) {
    val tempArr = arr

    var j = 0

    for (i in arr.indices) {
        if (arr[i] != 0) {
            tempArr[j] = arr[i]
            j++
        }
    }
    while (j < tempArr.size) {
        tempArr[j] = 0
        j++
    }
    println(tempArr.contentToString())
}

//Find Missing Number
fun findMissingNumber(arr: IntArray): Int {
    val n = arr.size
    val expectedSum = (n * (n + 1)) / 2

    var sum = 0

    for (i in arr) {
        sum += i
    }

    return expectedSum - sum
}

//Find Repeating Number
fun repeatingNumber(arr: IntArray): Int {
    val set = HashSet<Int>()
    for (i in arr) {
        if (set.contains(i)) {
            return i
        } else {
            set.add(i)
        }
    }
    return -1
}

//Merge Two Sorted Arrays
fun mergeTwoSortedArray(arr1: IntArray, arr2: IntArray): IntArray {

    val resultArr = IntArray(arr1.size + arr2.size)

    var i = 0
    var j = 0
    var k = 0

    while (i < arr1.size && j < arr2.size) {
        if (arr1[i] < arr2[j]) {
            resultArr[k] = arr1[i]
            i++
            k++
        } else {
            resultArr[k] = arr2[j]
            k++
            j++
        }
    }

    while (i < arr1.size) {
        resultArr[k] = arr1[i]
        i++
        k++
    }

    while (j < arr2.size) {
        resultArr[k] = arr2[j]
        j++
        k++
    }
    return resultArr
}

//k3

//input  1  2   3   4   5  6   7

// 1st      7  6   5    4   3   2  1
// 2nd      5   6   7 |  4   3   2  1
//3rd       5  6    7   1   2  3  4


// output  5  6   7  1  2   3   4


//Input:  [1, 2, 3, 4, 5, 6, 7]
//K = 3
//
//Output: [5,6, 7, 1, 2, 3, 4]

//  7  6  5  4  3    2   1
//              | 1  2  3

// 4 5  6  7  1  2   3

fun rotateK(arr: IntArray, k: Int): IntArray {
    reverse(0, arr.size - 1, arr)
    reverse(0, k - 1, arr)
    reverse(k, arr.size - 1, arr)

    return arr
}

fun reverse(firstIdx: Int, lastIdx: Int, arr: IntArray) {
    var f = firstIdx
    var l = lastIdx
    while (f < l) {
        val temp = arr[f]
        arr[f] = arr[l]
        arr[l] = temp

        f++
        l--
    }
}

class User(name: String, age: Int) {

    var name = name
    val age = age

    constructor(name: String) : this(name = name, age = 0) {
        this.name = name
    }
}

fun main() {
    val n = Outer.Nested().m1()
    val n2 = Outer2().Inner().m1()
    val c = User2.CompanionClas.create()

    val list = listOf<String>("a", "d")
    //  list.printAll()
    // print("shs".makeStyle())

    val add = { a: Int, b: Int -> a + b }


    val map = HashMap<String,Int>()
    map.put("A",map.getOrDefault("A",0)+1)
    map.put("A",map.get("A") as Int + 1)
    // or map["A"] = map["A"] as Int + 1
    map["A"] = (map["A"] ?: 0) + 1



    print(map)
}


fun String.makeStyle(): String {
    return "_______ $this-----------"
}

fun <T> List<T>.printAll() {
    print(this)
}

class User2 {

    companion object CompanionClas {

        const val TAG = "User"

        fun create(): User2 {
            return User2()
        }
    }
}

class Outer() {
    val age = 8

    class Nested() {

        fun m1() {
            // age
        }
    }
}

class Outer2 {
    val age = 8

    inner class Inner {
        fun m1() {
            age
        }
    }
}

