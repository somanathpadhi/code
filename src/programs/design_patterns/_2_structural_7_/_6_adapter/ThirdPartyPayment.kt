package programs.design_patterns._2_structural_7_._6_adapter

interface PaymentProcess{
    fun makePayment()
}
class ThirdPartyPayment: PaymentProcess{
    override fun makePayment() {
        println("Third party payment done!")
    }
}