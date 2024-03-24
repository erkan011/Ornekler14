class Person {
    private var name: String = ""
    private var age: Int = 0

    fun setName(newName: String){
        name = newName
    }
    fun setAge(newAge: Int){
        age = newAge
    }
    fun getName(): String{
        return name
    }
    fun getAge(): Int{
        return age
    }
}

fun main() {
    val person = Person()
    person.setName("John")
    person.setAge(22)

    println("Name: ${person.getName()}, Age: ${person.getAge()}")
}