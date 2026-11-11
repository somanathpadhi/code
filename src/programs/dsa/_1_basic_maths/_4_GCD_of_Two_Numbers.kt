package programs.dsa._1_basic_maths

import kotlin.math.min

fun main() {
    print(euclideanSolutionOptimal(4, 6))
}

//optimal
//O(log n)
//O(1)
fun euclideanSolutionOptimal(no1: Int,no2: Int): Int{

    var  tempNo1 = no1
    var tempNo2 = no2
    while (tempNo1  != 0 && tempNo2  != 0){
        if (tempNo1 > tempNo2 ){
            tempNo1 = tempNo1 % tempNo2
        }
        else{
            tempNo2 = tempNo2 % tempNo1
        }
    }
    return if (tempNo1 == 0) tempNo2 else tempNo1
}




//better
//O(n)
//O(1)
fun gcdEuclideanBetterApproach(no1: Int,no2: Int): Int{
    var tempNo1 = no1
    var tempNo2 = no2
    while (tempNo1 != 0 && tempNo2 != 0){
        if (tempNo1 > tempNo2){
            tempNo1 = tempNo1 - tempNo2
        }
        else {
            tempNo2 = tempNo2 - tempNo1
        }
    }
    return if (tempNo1 == 0) tempNo2 else tempNo1
}


//brute
//O(n)
//O(1)
fun gcdOfTwoNo(no1: Int, no2: Int): Int {

    if (no1 == 0) return no2
    if (no2 == 0) return no1

    val minNo = min(no1, no2)
    var gcd = 1
    for (i in 2..minNo) {
        if (no1 % i == 0 && no2 % i == 0) {
            gcd = i
        }
    }
    return gcd
}