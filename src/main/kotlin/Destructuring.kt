data class Kisi1(val ad: String, val soyad: String)
fun kisisel(): Kisi1{
    return Kisi1("Erkan" ,"Çalışkan")
}
fun main() {
    val (ad, soyad) = kisisel()

    println("ad: $ad")
    println("soyad: $soyad")
}