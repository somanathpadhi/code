package programs.dsa._1_basic_maths

fun main() {
    print(_root_ide_package_.programs.dsa._basic_maths.divisorsOfANumber(9))
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