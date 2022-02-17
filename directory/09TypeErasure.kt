package app

//type erasure adalah proses pengecekan generic pada saat compile time dan menghiraukan pengecekan pada saat runtime
//sebenarnya istilah generic hanya berlaku hingga waktu compile saja,ketika sudah mencapai runtime/byte code sudah bukan generic lagi
//type erasure menjadikan informasi generic yang kita buat akan hilang ketika kode program kita telah di compile menjadi binary file
//compiler akan mengubah generic parameter type menjadi tipe any atau menjadi object di java/artinya ketika di compile maka akan merubah generic file kita menjadi any atau object pada java

class TypeErasure<T>(param: T){
    private val data: T = param
    fun getData(): T = data
}

//PROBLEM TYPE ERASURE
//karena informasi generic hilang ketika sudah menjadi binary file
//oleh karena itu,konversi tipe data generic akan berbahaya jika dilakukan secara tidak bijak

fun main() {
    val data1 = TypeErasure<String>("Eko")
    val dataString: String = data1.getData()
    println(dataString)

    val data2: TypeErasure<Int> = data1 as TypeErasure<Int>
    val dataInt = data2.getData() // error konversi
    println(dataInt)
}