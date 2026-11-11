package programs.kotlin_codes

//control flow
//lambda
//higher order function

fun calculate(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
    return sum(a, b)
}

fun <T> T.generic() {

    print(this)
}

fun <T> T.genericExtFn() {
    print(this)
}

class GettersSettersDemo {
    var firstName: String = ""
        get() = field
        set(value) {
            field = value
        }


    val lastName: String = ""

    val fullName = "$firstName $lastName"
}

interface MyInterface {
    fun run()
}

class A : MyInterface {
    override fun run() {
        print("programs.kotlin_codes.A running")
    }
}

class B(myInterface: MyInterface) : MyInterface by myInterface

fun main() {

    val dataCopy1 = DataCopy("Soma", Address2("BLR"))
    val dataCopy2 = dataCopy1.copy(address =  Address2(dataCopy1.address.city))
    dataCopy2.name = "do"
    dataCopy2.address.city = "Mumbai"
    println(dataCopy1.name)
    println(dataCopy1.address.city)

    println(dataCopy2.name)
    println(dataCopy2.address.city)

}

data class Address2(var city: String)
data class DataCopy(var name: String, var address: Address2) {

}