open class Animal(val name: String){
    open fun makeSound(){
        println("$name is making a sound")
    }
}

class Dog(name: String, val breed: String): Animal(name){
    override fun makeSound() {
        println("$name is barking")
    }
    fun fetch(){
        println("$name is fetching")
    }
}

fun main() {
    val animal = Animal("Generic Animal")
    val dog = Dog("Buddy", "Labrador")
    animal.makeSound()
    dog.makeSound()
    dog.fetch()
}