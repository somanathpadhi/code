package programs.design_patterns._1_creational_5_._3_factory

interface Payment {
    fun pay()
}

class Upi : Payment {
    override fun pay() {
        println("Upi payment done")
    }
}

class Card : Payment {
    override fun pay() {
        println("Card payment done")
    }
}

class PaymentFactory() {

    fun getPayment(paymentType: String): Payment {
        if (paymentType == "upi") {
            return Upi()
        } else if (paymentType == "card") {
            return Card()
        } else {
            throw IllegalArgumentException("Invalid payment type")
        }
    }
}

fun main() {
    val payment = PaymentFactory().getPayment("upi")
    payment.pay()
}
