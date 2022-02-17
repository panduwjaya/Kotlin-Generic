package app

//MATER KOTLIN GENERIC SUDAH SELESAI HINGGA TYPE ERASURE
//NAMUN KALI INI KITA AKAN MEMBAHAS CLASS DAN INTERFACE YANG MENGGUNAKAN FITUR KOTLIN GENERIC

//COMPARABLE INTERFACE
//sebelumnya kita sudah tahu bahwa operator perbandingan == dan != akan menggunakan metode equals sebagai implementasinya
//bagaimana dengan operator perbandingan lainnya? seperti (>,>=,<,<=,?)
//operator perbandingan lainnya seperti (>,>=,<,<=,?) menggunakan generic comparable
//operator perbandingan tersebut bisa kita lakukan jika object kita mewariskan interface generic comparable

import data.Fruit

fun main() {
    val fruit1 = Fruit("Apple", 100)
    val fruit2 = Fruit("Apple", 10)

    //ketika kita ctrl+klik pada operator perbandingan lainnya seperti (>,>=,<,<=,?),maka akan mengacu kepada function compareTo()
    println(fruit1 > fruit2)//true
    println(fruit1 >= fruit2)//true
    println(fruit1 < fruit2)//false
    println(fruit1 <= fruit2)//false
}