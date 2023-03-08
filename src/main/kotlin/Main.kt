fun main() {
    print("Masukkan angka: ")
    val angka = readLine()!!.toInt()

    var angka2 = true
    for (i in 2 until angka/2) {
        if (angka % i == 0) {
            angka2 = false
            break
        }
    }

    if (angka == 1) {
        print("$angka bukan bilangan prima")
    } else if (angka2) {
        print("$angka adalah bilangan prima")
    } else {
        print("$angka bukan bilangan prima")
    }
}