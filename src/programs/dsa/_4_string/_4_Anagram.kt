package programs.dsa._4_string


fun main() {
    println(anagram("cat", "cta"))
}

//6. Check if Two Strings are Anagrams
//"listen", "silent" → true
fun anagram(str1: String, str2: String): Boolean {

    val char = IntArray(26)

    if (str1.length != str2.length) {
        return false
    }

    for (i in str1.indices) {
        char[str1[i] - 'a']++
    }

    for (i in str2.indices) {
        char[str2[i] - 'a']--
    }
    for (i in char) {
        if (i != 0) {
            return false
        }
    }
    return true
}