package programs.design_patterns._1_creational_5_._2_builder

class Employee(val name: String, val id: Int) {
    override fun toString(): String {
        return "$name and $id"
    }


    class Builder {
        var name: String = ""
        var id: Int = 0

        fun setName(name: String) = apply { this.name = name }

        fun setId(id: Int) = apply { this.id = id }

        fun build(): Employee {
            return Employee(name, id)
        }
    }

}

fun main() {
    val employee = Employee.Builder().setName("somanath").setId(2).build()
    println(employee)
}