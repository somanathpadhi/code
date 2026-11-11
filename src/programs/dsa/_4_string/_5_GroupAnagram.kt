package programs.dsa._4_string

//Group Anagrams
//["eat","tea","tan","ate","nat","bat"]
//
//→
//[
// ["eat","tea","ate"],
// ["tan","nat"],
// ["bat"]

fun main() {
    val strs = arrayOf(
        "eat",
        "tea",
        "tan",
        "ate",
        "nat",
        "bat"
    )

    println(groupAnagram2(strs))
}

fun groupAnagram2(strArr: Array<String>): List<List<String>> {
    val map = HashMap<String, MutableList<String>>()

    for (word in strArr) {
        val charArray = word.toCharArray()
        charArray.sort()
        val sortedWord = String(charArray)

        if (!map.containsKey(sortedWord)) {
            map[sortedWord] = mutableListOf()
        }
        map[sortedWord]?.add(word)
    }
    return map.values.toList()
}