package app

//WHERE KEYWORD
//kadang kita ingin membatasi tipe data dengan beberapa jenis tipe data di generic parameter type
//secara default hanya satu tipe data yang bisa digunakan untuk membatasi generic parameter type
//jika kita ingin menggunakan lebih dari satu tipe data,kita bisa menggunakan keyword "where"

interface CanSayHello {
    fun sayHello(name: String)
}

open class Employee

class Manager : Employee()

class VicePresident : Employee(), CanSayHello {
    override fun sayHello(name: String) {
        println("Hello $name, I'm vice president")
    }
}

class Company<T>(val employee: T) where T : Employee, T : CanSayHello//fungsi dari "where" adalah untuk membuat beberapa jenis tipe data/constraint di generic parameter type

fun main() {
    // val data1 = Company(Employee()) // error karena tidak mencakup CanSayHello
    // val data2 = Company(Manager()) //error karena tidak mencakup CanSayHello
    val data3 = Company(VicePresident())//ini tidak eror karena mencakup interface CanSayHello dan class Employee
    // val data4 = Company("String") // error karen not Employee
}