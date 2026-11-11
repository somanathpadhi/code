package programs.dsa._4_string

//Reverse Each Word
//
//"Hello World"
//→ "olleH dlroW"
fun main() {
    println(_root_ide_package_.programs.dsa._3_string.reverEachWord("Hello World"))
}

fun reverEachWord(str: String): String {

    var word = " "
    var resultStr = " "
    for (char in str) {
        if (char != ' ') {
            word = char + word
        } else {
            resultStr += word
            word = " "
        }
    }
    resultStr += word
    return resultStr
}