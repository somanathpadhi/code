package programs.design_patterns._2_structural_7_._6_adapter

interface PaymentProcessor {
    fun processPayment()
}

class Card : PaymentProcessor {
    override fun processPayment() {
        println("processed card!")
    }
}

class ProcessAdaptor(val thirdPartyPayment: ThirdPartyPayment) : PaymentProcessor {

    override fun processPayment() {
        thirdPartyPayment.makePayment()
    }
}


fun main() {
    val paymentProcessor1: PaymentProcessor = Card()
    paymentProcessor1.processPayment()


    val paymentProcessor2: PaymentProcessor = ProcessAdaptor(ThirdPartyPayment())
    paymentProcessor2.processPayment()

}