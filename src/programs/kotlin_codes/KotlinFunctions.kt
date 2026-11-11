package programs.kotlin_codes

//collection functions

fun main() {
    //1. slice
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    val chars = listOf("a","b","c","d")
    val str = listOf("abc","dsf","tfcg","ddgg")
    val listOfLists = listOf(listOf(12,3,4,5,6),listOf(8,9,0))
    println(numbers.slice(0..2))
    //2. take
    println(numbers.take(2))
    //3. drop
    val list = numbers.drop(1)
    println(list)
    //4. chunked
    println(numbers.chunked(3))
    println(numbers.chunked(3){it.sum()})
    println(numbers.windowed(3, step = 2))
    //5. random
    println(numbers.random())
    println(numbers.shuffled())

    //6. contains
    println(numbers.contains(2))
    //7. isEmpty


    //8. filter
    println(numbers.filter { it > 2 })
    //9. partition
    val partition = numbers.partition { it < 4 }
    println(partition)

    println(numbers.map { it * 2 })
    println(numbers.mapIndexed { index, i ->  i * index })
    println(numbers.zip(chars))
    println(chars.associateBy { it.length })
    println(listOfLists.flatten())
    println(listOfLists.flatMap{it})

    println(chars.joinToString())
    println(str.groupBy { it.first() })
    println(numbers.sorted())
    println(str.sortedBy { it.length })
    println(numbers.sortedDescending())
    println(numbers.reversed())

    val arrayDeque = ArrayDeque(listOf(1,2,3,4,5))
    arrayDeque.add(4)
    arrayDeque.addLast(7)

}
data class Error23(val message: String) : Results()



