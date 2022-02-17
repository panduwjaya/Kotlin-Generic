package app

//kadang ada kasus kita tidak peduli dengan generic parameter type pada object
//misal kita hanya ingin mengambil panjang data array<T> dan kita tidak peduli dengan isi data T nya
//jika kita mengalami kasus seperti ini kita bisa menggunakan star projection
//star projection bisa dibuat dengan mengganti generic parameter type dengan karakter "*" atau disebut sebagai simbol bintang/star

//alasan Array<*> itu berasal dari mana,sebab secara default array sendiri itu merupakan generic class (array: Array<*>)
fun displayLength(array: Array<*>) {//fungsi dari star projection adalah untuk menggantikan tipe data padaa generic type parameter
    println("Total array is ${array.size}")//fokus kita pada star projection adalah bukan kepada generic type
}

//FUNGSI DARI STAR PROJECTION
//ketika kita menggunakan star projection kita tidak perlu mempedulikan constravariant dan covariant seperti pada type projection

fun main() {
    val arrayInt: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val arrayString: Array<String> = arrayOf("Eko", "Kurniawan", "Khannedy")

    displayLength(arrayInt)
    displayLength(arrayString)
}