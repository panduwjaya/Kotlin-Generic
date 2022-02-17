package app

//covariant artinya kita bisa melakukan substitusi subtype(child) kepada supertype (parent)
//tidak semua jenis class generic yang mendukung covariant,hanya class generic yang menggunakan generic parameter type sebagai return type function
//artinya saat kita membuat object Contoh<String>,maka bisa disubstitusi menjadi Contoh<Any>
//untuk memberitahu bahwa generic parameter type tersebut adalah covariant,kita perlu menggunakan keyword "out"

class Covariant<out T>(val data: T) {//disini properties pada constructor harus val karena jika var dikhawatir dapat menerima data dari luar/berubah,sedangkan pada covariant tidak boleh input data dari luar

    fun data(): T {//pada covariant hanya dapat memiliki function dengan return data generic,tidak mensupport penggunaan input untuk menerima data generic pada function
        return data
    }

    // tidak boleh membuat function dengan input generic covariant
//    fun setData(param: T){
//        data = param
//    }

}

fun main() {
    val covariantString = Covariant<String>("Eko")
    val covariantAny: Covariant<Any> = covariantString

    println(covariantAny.data())

    // covariantAny.setData(100) tidak boleh
}