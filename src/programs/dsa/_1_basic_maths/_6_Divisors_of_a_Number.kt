package programs.dsa._1_basic_maths

fun main() {
    print(divisorsOfANumber(9))
}

fun divisorsOfANumber(no: Int): List<Int> {
    val divisorList = mutableListOf<Int>()

    for (i in 1..no) {
        if (no % i == 0) {
            divisorList.add(i)
        }
    }
    return divisorList
}