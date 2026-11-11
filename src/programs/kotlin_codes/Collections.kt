package programs.kotlin_codes

fun main() {
    //Kotlin has 2 types of every collection
        //1. Immutable (read only)
        //2. Mutable (read + write)


        //Immutable (read only)     Mutable (read + write)
// List   listOf()                     mutableListOf()
// Set    setOf()                      mutableSetOf()
// Map    mapOf()                      mutableMapOf()


    //1. List — ordered, allows duplicates

    // Immutable
    val fruits2 = listOf("Apple", "Banana", "Apple", "Mango")
    println(fruits2[0])        // Apple
    println(fruits2.size)      // 4


    // Mutable
    val numbers2 = mutableListOf(1, 2, 3)
    numbers2.add(4)            // ✅ programs.kotlin_codes.add item
    numbers2.remove(2)         // ✅ remove item
    numbers2[0] = 10           // ✅ update item
    println(numbers2)          // [10, 3, 4]

    //Key points:

    //Ordered — items stay in the order you added them
    //Allows duplicates — same value can appear multiple times
    //Access by index starting from 0

    //2. Set — unordered, no duplicates
    // Immutable
    val ids = setOf(1, 2, 3, 2, 1)
    println(ids)              // [1, 2, 3] — duplicates removed!

// Mutable
    val names = mutableSetOf("Somanath", "Raj")
    names.add("Kumar")        // ✅
    names.add("Somanath")     // ❌ ignored, already exists
    println(names)

    //Key points:
    //
    //No duplicates — automatically ignored
    //No index access — you can't do ids[0]
    //Use when you need unique values only

    //3. Map — key-value pairs

    // Immutable
    val person = mapOf("name" to "Somanath", "age" to 25)
    println(person["name"])   // Somanath
    println(person["age"])    // 25

// Mutable
    val scores = mutableMapOf("Kotlin" to 95, "Java" to 80)
    scores["DSA"] = 70        // ✅ programs.kotlin_codes.add new key
    scores["Java"] = 85       // ✅ update existing key
    scores.remove("Java")     // ✅ remove key
    println(scores)           // {Kotlin=95, DSA=70}

    //Key points:
    //
    //Stores key → value pairs
    //Keys are unique — no duplicate keys
    //Access value by key, not index


    //Iterating (looping) over collections
    val fruits = listOf("Apple", "Banana", "Mango")

// for loop
    for (fruit in fruits) {
        println(fruit)
    }

// forEach
    fruits.forEach { println(it) }

// forEachIndexed — when you need index too
    fruits.forEachIndexed { index, fruit ->
        println("$index: $fruit")
    }
// 0: Apple
// 1: Banana
// 2: Mango

    //Common operators on collections
    val numbers = listOf(1, 2, 3, 4, 5, 6)

// filter — keep items matching condition
    val evens = numbers.filter { it % 2 == 0 }
    println(evens)            // [2, 4, 6]

// map — transform every item
    val doubled = numbers.map { it * 2 }
    println(doubled)          // [2, 4, 6, 8, 10, 12]

// find — first item matching condition
    val first = numbers.find { it > 3 }
    println(first)            // 4

// any — true if at least one matches
    println(numbers.any { it > 5 })   // true

// all — true if every item matches
    println(numbers.all { it > 0 })   // true

// count — count matching items
    println(numbers.count { it % 2 == 0 }) // 3

// programs.kotlin_codes.sum / average
    println(numbers.sum())        // 21
    println(numbers.average())    // 3.5

// sorted
    val unsorted = listOf(3, 1, 4, 1, 5)
    println(unsorted.sorted())    // [1, 1, 3, 4, 5]

// groupBy — group items by a condition
    val grouped = numbers.groupBy { if (it % 2 == 0) "even" else "odd" }
    println(grouped)  // {odd=[1, 3, 5], even=[2, 4, 6]}


    //Chaining operators
    val numbers3 = listOf(1, 2, 3, 4, 5, 6)

    val result = numbers3
        .filter { it % 2 == 0 }   // keep evens → [2, 4, 6]
        .map { it * 10 }           // multiply → [20, 40, 60]
        .sorted()                  // sort → [20, 40, 60]

    println(result)  // [20, 40, 60]

    //Null safety in collections
    // List that can hold nulls
    val list = listOf("Apple", null, "Mango")

// filterNotNull — removes nulls
    val clean = list.filterNotNull()
    println(clean)  // [Apple, Mango]

    //Ordered Set — LinkedHashSet //Maintains insertion order (the order you added items).
    val orderedSet = linkedSetOf("Banana", "Apple", "Mango")
    println(orderedSet)  // [Banana, Apple, Mango] ✅ order preserved

    //Sorted Set — TreeSet //Maintains natural sorted order (alphabetical for Strings, ascending for numbers).
    val sortedSet = sortedSetOf("Banana", "Apple", "Mango")
    println(sortedSet)  // [Apple, Banana, Mango] ✅ alphabetical

    val sortedNumbers = sortedSetOf(5, 3, 1, 4, 2)
    println(sortedNumbers)  // [1, 2, 3, 4, 5] ✅ ascending

    //Ordered Map — LinkedHashMap //Maintains insertion order.
    val orderedMap = linkedMapOf("name" to "Somanath", "age" to 25, "city" to "Bangalore")
    println(orderedMap)  // {name=Somanath, age=25, city=Bangalore} ✅ order preserved

    //Sorted Map — TreeMap  //Maintains natural sorted order by key.
    val sortedMap = sortedMapOf("banana" to 2, "apple" to 5, "mango" to 1)
    println(sortedMap)  // {apple=5, banana=2, mango=1} ✅ keys alphabetical

    //Simple rule:
    //
    //Need insertion order? → use linked
    //Need sorted order? → use sorted
}