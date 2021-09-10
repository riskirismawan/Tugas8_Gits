open class Mahasiswa(private val nama: String, private val universitas: String, private val nim: String) {
    open fun tampilkan() {
        println("Mahasiswa $universitas\nNama\t: $nama\nNIM\t\t: $nim")
    }
}

class MSIB(nama: String, universitas: String, nim: String, private val program: String = "Kotlin", private val msib: String = "Studi Independen")
    : Mahasiswa(nama, universitas, nim) {
    override fun tampilkan() {
        super.tampilkan()
        println("Program\t: $msib $program")
    }
}