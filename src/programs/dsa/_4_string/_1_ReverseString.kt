package programs.dsa._4_string

fun main() {
    println(reverseString("Hello"))
}

//1. Reverse a String
fun reverseString(str: String): String {
    var res = ""
    for (i in str.length - 1 downTo 0) {
        res += str[i]
    }
    return res
}