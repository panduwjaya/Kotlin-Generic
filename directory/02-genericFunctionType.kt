package directory

import Data.Function

//generic parameter type tidak hanya bisa digunakan pada class atau interface
//kita juga bisa menggunakan generic parameter type di function
//generic paramter type yang kita deklarasikan di function,hanya bisa diakses di function tsb.
//tidak bisa digunakan diluar function tersebut
//ini cocok jika kita ingin membuat generic function,tanpa harus mengubah deklarasi class

fun main(args: Array<String>) {
    val fungsi = Function("Pandu")

    fungsi.hello<String>("Muntahir")//penulisan secara manual menggunakan <String>
    fungsi.hello("Muntahir")//kita juga bisa tidak perlu menuliskan <String> secara manual

    fungsi.hello<Int>(1000)//penulisan secara manual menggunakan <Int>
    fungsi.hello(1000)//kita juga bisa tidak perlu menuliskan <Int> secara manual
}