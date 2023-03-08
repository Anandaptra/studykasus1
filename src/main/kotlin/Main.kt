fun main() {
    println("Masukkan angka: ")
    val angka = readLine()!!.toInt()

    var angka2 = true
    for (i in 2..angka/2) {
        if (angka % i == 0) {
            angka2 = false
            break
        }
    }

    if (angka == 1) {
        println("Bilangan 1 bukanlah bilangan prima")
    } else if (angka2) {
        println("$angka adalah bilangan prima")
    } else {
        println("Bilangan $angka bukanlah bilangan prima")
    }
}