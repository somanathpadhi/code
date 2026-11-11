package programs.design_patterns._1_creational_5_._3_factory

interface PaymentMethod {
    fun pay()
}

class Upii : PaymentMethod {
    override fun pay() {
        println("Upi done")
    }
}

class DebitCard : PaymentMethod {
    override fun pay() {
        println("Debit card pay done")
    }
}

class MyFactory {
    fun makePayment(type: String): PaymentMethod? {
        if (type == "Upi") {
            return Upii()
        } else if (type == "debit") {
            return DebitCard()
        } else return null
    }
}

fun main() {
    val paymentMethod = MyFactory().makePayment("Upi")
    paymentMethod?.pay()
}