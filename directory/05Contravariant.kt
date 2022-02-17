package app

//CONTRAVARIANT
//contravariant artinya kita bisa melakukan substitusi supertype(parent) kepada substype(child) atau kebalikan dari covariant
//tidak semua jenis class generic yang mendukung contravariaant hanya class generic yang menggunakan generic parameter type sebagai parameter function
//artinya saat kita membuat object Contoh<Any>,maka bisa disubstitusi menjadi Contoh<String>
//untuk memberitahu bahwa generic parameter type tersebut adalah covariant,kita perlu menggunakan kata kunci "in"

class Contravariant<in T>{//penggunaan keyword in pada generic parameter
    fun sayHello(param: T){//perbedaan pada contravariant boleh memiliki input data generic namun tidak boleh memiliki return value pada function nya
        println("Hello $param")
    }

    // tidak boleh
//    fun getData():T {
//        return data
//    }
}

fun main() {
    val contravariantAny = Contravariant<Any>()
    val contravariantString: Contravariant<String> = contravariantAny//melakukan substitusi supertype(parent) kepada substype(child),yg mana string merupakan turunan dari any

    // contravariantString.getData() // error
    contravariantString.sayHello("Eko")
}