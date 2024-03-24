open class Hayvan{
    open fun sesCikar(){
        println("Ses çıkarılamadı")
    }
}
class Kopek : Hayvan() {
    override fun sesCikar() {
        println("Hav hav!")
    }
}

class Kedi : Hayvan(){
    override fun sesCikar() {
        println("Miyav!")
    }
}

fun main() {
    val kopek = Kopek()
    val kedi = Kedi()

    kopek.sesCikar()
    kedi.sesCikar()
}