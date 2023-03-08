fun main() {
    print("Masukkan angka: ")
    val angka = readLine()!!.toInt()

    var angka2 = true
    for (i in 2..angka/2) {
        if (angka % i == 0) {
            angka2 = false
            break
        }
    }

    if (angka == 1) {
        print("$angka bukanlah bilangan prima")
    } else if (angka2) {
        print("$angka adalah bilangan prima")
    } else {
        print("$angka bukanlah bilangan prima")
    }
}