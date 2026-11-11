package programs.dsa._4_string

//2. Check if a String is Palindrome aba -> aba
//"madam" → true
fun isPalindrome(str: String): Boolean {
    var firstIdx = 0
    var lastIndex = str.length - 1

    while (firstIdx < lastIndex) {
        if (str[firstIdx] != str[lastIndex]) {
            return false
        }
        firstIdx++
        lastIndex--
    }
    return true
}

fun main() {
    println(_root_ide_package_.programs.dsa._3_string.isPalindrome("121"))
}