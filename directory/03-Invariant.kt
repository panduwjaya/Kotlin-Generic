package app

//secara default saat kita membuat generic parameter type,sifat parameter tersebut adalah invariant
//invariant artinya tidak boleh di subtitusi dengan substype (child) atau supertype(parent),jadi kita bisa menurunkan sebuah class
//artinya jika kita mempunyai sebuah tipe data any maka kita tidak bisa melakukan turunan tipe data string dari tipe data any
//artinya saat kita membuat object contoh <String>,maka tidak sama dengan contoh <Any>
//begitupun sebaliknya saat membuat object contoh<Any> maka tidak sama dengan contoh <String>

class Invariant<T>(var data: T)

fun main() {
    val invariantString = Invariant("String")

    // val invariantAny: Invariant<Any> = invariantString// tidak bisa,karena pada invariant any tidak bisa melakukan turunan terhadap subclass nya yaitu string
    // invariantAny.data = 100  // bahaya
}