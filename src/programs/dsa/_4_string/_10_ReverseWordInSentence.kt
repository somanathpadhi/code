package programs.dsa._4_string

fun main() {
   println(reverseWordInSentence("Hello World Kotlin"))
}
//Reverse Words in a Sentence
//"Hello World Kotlin"
//→ "Kotlin World Hello"

fun reverseWordInSentence(str: String): String{
    var word = " "
    var resultStr = " "
    for(char in str){
        if (char != ' '){
            word += char
        }
        else{
            resultStr = word + resultStr
            word = " "
        }
    }
    resultStr = word + resultStr
    return resultStr
}