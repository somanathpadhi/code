package programs.dsa._4_string

fun main() {
    println(_root_ide_package_.programs.dsa._3_string.reverseString("Hello"))
}

//1. Reverse a String
fun reverseString(str: String): String {
    var res = ""
    for (i in str.length - 1 downTo 0) {
        res += str[i]
    }
    return res
}