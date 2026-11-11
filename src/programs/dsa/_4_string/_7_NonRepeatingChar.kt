package programs.dsa._4_string

//swiss ->  w
fun main() {
    println(_root_ide_package_.programs.dsa._3_string.nonRepeatingChar("swiss"))
}
//Find First Non-Repeating Character //swi
fun nonRepeatingChar(str: String): Char?{
    val map = LinkedHashMap<Char,Int>()
    for (char in str){
        map[char] = (map[char] ?: 0) + 1
    }
    for ((key, value) in map){
        if (value == 1){
            return key
        }
    }
    return null
}