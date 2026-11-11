package programs.dsa._4_string
//swiss -> swi
fun main() {
    println(removeDuplicate("swiss"))
}
//Remove Duplicate Characters
fun removeDuplicate(str: String): String{
    val map = LinkedHashMap<Char,Int>()
    var result = ""
    for (char in str){
        map[char] = (map[char] ?: 0 ) + 1
    }
    for (entry in map){
        result += entry.key
    }
    return result
}
