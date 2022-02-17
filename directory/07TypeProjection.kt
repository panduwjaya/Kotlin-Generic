package app

//TYPE PROJECTION
//kadang agak sulit untuk membuat class generic type yang harus covariant atau contravariant
//misal karena memang di class generic tersebut terdapat input dan output generic paramter type
//namun jika kita membuat function untuk memanipulasi data invriant sangatlah sulit,karena generic parameter type nya harus selalu sama
//kita bisa melakukan type projection yaitu menambahkan informasi covariant atau contravariant di parameter function ini memaksa isi function untuk melakukan pengecekakan
//jika contravariant kita tidak boleh mengambil data generic object

//FUNGSI DARI TYPE PROJECTION = untuk mempermudah dalam mencopy data

class Container<T>(var data: T)//ini merupakan generic type berbentuk invariant,artinya generic parameternya harus sama

//fun copyContainer(from: Container<Any>, to: Container<Any>) {//ini contoh dalam bentuk invariant yang mana dalam bentuk invariant constraint/diamond opertor dan constructor harus sama
fun copyContainer(from: Container<out Any>, to: Container<in Any>) {//ini merupakan proses dari type projection yaitu memaksa invariant untuk menjadi convariant atau contravariant
    to.data = from.data
}

fun main() {
    val container1 = Container("Eko")
    val container2: Container<Any> = Container("Kurniawna")

    copyContainer(container1, container2)

    println(container1.data)//hasilnya sama,karena dari container 1 dicoppy ke container 2
    println(container2.data)//hasilnya sama,karena dari container 1 dicoppy ke container 2
}