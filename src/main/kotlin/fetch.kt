class Dog1(private val name1: String) {
    fun bark(){
        println("$name1 is barking")
    }
    fun fetch(){
        println("$name1 is fetching")
    }
}

fun main() {
    val dog = Dog1("Karabaş")
    dog.bark()
    dog.fetch()
}