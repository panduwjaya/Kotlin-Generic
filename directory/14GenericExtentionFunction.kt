package app

//GENERIC EXTENSION FUNCTION
//generic juga bisa digunakan pada extension function
//dengan begitu kita bisa memilih jenis generic parameter type apa yang bisa menggunakan extension function tersebut

class Data<T>(val data: T)//<T> ini disebut sebagai generic type sedangkan ini (val data: T) disebut sebagai generic parameter type

fun Data<String>.printString(){
    val data: String = this.data
    println(data)
}

fun Data<Int>.printInt(){
    val data: Int = this.data
    println(data)
}

fun main() {
    val data1 = Data("Eko")
    val data2 = Data(1)

    // data2.printString() // error, karena generic extension function printString bukan berada pada object data2
    data1.printString()
    data2.printInt()
}