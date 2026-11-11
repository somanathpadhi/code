package programs.dsa._4_string

//3. Count Occurrences of a Character// somanath

fun main() {
    _root_ide_package_.programs.dsa._3_string.countOccurrence("Hello")
}
fun countOccurrence(str: String) {
    val map: MutableMap<Char, Int> = mutableMapOf()
    for (char in str) {
        map[char] = (map[char] ?: 0) + 1
    }
    map.onEachIndexed { _, entry ->
        if (entry.value == 1) {
            println(entry.key)
        }
    }
}