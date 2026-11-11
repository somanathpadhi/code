package programs.kotlin_codes

open class Animal
class Dog : Animal()
class Cat : Animal()

class Box<out T>(val value: T) {

//    fun consume(item: T) { // write
//        value = item
//    }

    fun produce(): T { // read
        return value
    }
}

class Consumer<in T>{
    fun consume(item: T) { // write

    }
//    fun produce(): T { // read
//        return value
//    }
}


fun main() {

    val animal: Animal = Animal()
    val dog: Dog = Dog()
    val cat: Cat = Cat()

    val tempAnimal: Animal = cat

    val animalBox: Box<Animal> = Box(Animal())
    val dogBox : Box<Dog> = Box(Dog())
    val catBox: Box<Cat> = Box(Cat())

    val tempAnimalBox : Box<Animal> = catBox

    val list: List<Int> = listOf(1,2,3)
    val nos: List<Number> = list
    val n: List<Number> = list
    val animalConsumer: Consumer<Animal> = Consumer<Animal>()
    val dogConsumer: Consumer<Dog> = Consumer<Dog>()
    val catConsumer: Consumer<Cat> = Consumer<Cat>()

    val tempCatConsumer: Consumer<Cat> = animalConsumer
    tempCatConsumer.consume(Cat())

    print("$tempCatConsumer $animalConsumer")
}