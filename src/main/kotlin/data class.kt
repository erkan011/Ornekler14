// Data class oluşturma
data class Kisi(val ad: String, val yas: Int)

fun main() {
    // Data class nesnesi oluşturma
    val kisi1 = Kisi("Ahmet", 30)
    val kisi2 = Kisi("Mehmet", 25)

    // toString metodu kullanımı
    println("Kişi 1: $kisi1")
    println("Kişi 2: $kisi2")

    // equals metodu kullanımı
    val kisi3 = Kisi("Ahmet", 30)
    println("Kişi 1 ve Kişi 3 eşit mi? ${kisi1 == kisi3}")

    // copy metodu kullanımı
    val kisi4 = kisi1.copy(yas = 35)
    println("Kişi 1'in yaşını değiştirdikten sonra: $kisi4")
}
