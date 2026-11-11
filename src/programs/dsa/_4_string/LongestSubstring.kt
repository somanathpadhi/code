package programs.dsa._4_string

fun main() {
    val str = "fabcdabcgj"
    print(_root_ide_package_.programs.dsa._3_string.longestSubS(str))
}

fun longestSubstring2(s: String): String {
    val count = IntArray(256) { 0 }
    var l = 0
    var r = 0
    var bestStart = 0
    var bestLen = 0

    while (r < s.length) {
        count[s[r].code]++

        while (count[s[r].code] > 1) {
            count[s[l].code]--
            l++
        }

        if (r - l + 1 > bestLen) {
            bestLen = r - l + 1
            bestStart = l
        }

        r++
    }

    var result = ""
    for (i in bestStart until bestStart + bestLen) {
        result += s[i]
    }

    return result
}

fun longestSubS(s: String): String {
    val seen = HashMap<Char, Int>()
    var startIndex = 0
    var bestStart = 0
    var bestLength = 0

    for (endIndex in s.indices) {
        val char = s[endIndex]
        val lastSeen = seen.getOrDefault(char, -1)

        if (lastSeen >= startIndex) {
            startIndex = lastSeen + 1
        }

        seen[char] = endIndex

        if (endIndex - startIndex + 1 > bestLength) {
            bestLength = endIndex - startIndex + 1
            bestStart = startIndex
        }
    }
    var result = ""
    for (i in bestStart..<bestStart + bestLength) {
        result = result + s[i]
    }
    return result
}

fun longestSubstring(s: String): String {
    val seen = HashMap<Char, Int>()
    var start = 0
    var bestStart = 0
    var bestLen = 0

    for (end in s.indices) {
        val c = s[end]

        // getOrDefault avoids !! operator
        val lastIndex = seen.getOrDefault(c, -1)

        if (lastIndex >= start) {
            start = lastIndex + 1
        }

        seen[c] = end

        if (end - start + 1 > bestLen) {
            bestLen = end - start + 1
            bestStart = start
        }
    }

    var result = ""
    for (i in bestStart until bestStart + bestLen) {
        result += s[i]
    }
    return result
}