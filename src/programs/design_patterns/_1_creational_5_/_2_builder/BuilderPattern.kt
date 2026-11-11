package programs.design_patterns._1_creational_5_._2_builder

class User private constructor(
    val id: Int,
    val name: String,
    val age: Int
) {

    override fun toString(): String {
        return "name ${this.name} age ${this.age}  id $id"
    }

    class Builder {

        var id: Int = 0
        var name: String = ""
        var age: Int = 0

        fun setId(id: Int) = apply {
            this.id = id
        }
        fun setName(name: String) = apply {
            this.name = name
        }

        fun setAge(age: Int) = apply {
            this.age = age
        }

        fun build(): User{
            return User(id,name,age)
        }
    }
}

fun main() {
    val user = User.Builder()
        .setId(4)
        .setName("soma")
        .setAge(5)
        .build()
    println(user)
}
