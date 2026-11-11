package programs.dsa._4_string

//swiss ->s
fun main() {
    println(_root_ide_package_.programs.dsa._3_string.repeatingChar("swiss"))
}
//Find First Repeating Character
fun repeatingChar(str: String): Char?{
    val map = LinkedHashMap<Char, Int>()
    for (char in str){
        map[char] = (map[char]?:0) + 1
    }
    for ((key,value) in map){
        if (value > 1){
            return key
        }
    }
    return null
}