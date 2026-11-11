package programs.dsa._2_array


//You are given an array where:
//prices[i] represents the stock price on the i-th day.
//You can:
//buy only once
//sell only once
//must buy before selling
//Find the maximum profit possible.
//prices = [7,1,5,3,6,4, 9]
// time complexity = O(n)
// spce complexity = O(1)

//----------------
fun maxProfitWithTimeN(pricesArray: Array<Int>): Int {
    var minPrice = pricesArray[0]
    var maxProfit = 0
    for (price in pricesArray) {
        minPrice = Math.min(minPrice, price)
        maxProfit = Math.max(maxProfit, price - minPrice)
    }
    return maxProfit
}

//----------------
// time complexity = O(n^2)
// spce complexity = O(1)
fun maxProfit(pricesArray: Array<Int>): Int {
    var maxProfit = 0
    for (i in pricesArray.indices) {
        for (j in pricesArray.indices) {
            if (pricesArray[i] < pricesArray[j]) {
                val dif = pricesArray[j] - pricesArray[i]
                if (dif > maxProfit) {
                    maxProfit = dif
                }
            }
        }
    }
    return maxProfit
}

fun main() {

    //----------------
    val pricesArray = arrayOf(7, 1, 5, 3, 6, 4, 9)
    print(_root_ide_package_.programs.dsa._1_array.maxProfitWithTimeN(pricesArray))
}