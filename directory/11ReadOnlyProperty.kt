package app

//READ ONLY PROPERTY INTERFACE
//sebelumnya kita sudah belajar tentang delegate di kotlin
//di kotlin ada sebuah interface generic yang bisa digunakan sebagai delegate property yg sifatnya readonly alias val(immutable) namanya ReadOnlyProperty
//ReadOnlyProperty bisa digunakan sebagai delegate sehingga sebelum data kita kembalikan kita bisa melakukan sesuatu atau bahkan mengubah value property
//kita bisa mengubah value dari val/imutable kita bisa melakukan manipulasi menggunakan delegate ReadOnlyProperty

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class LogReadOnlyProperty(val data: String): ReadOnlyProperty<Any, String> {
    var counter: Int = 0
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Access property ${property.name} with value $data")
        counter++
        return "$counter.${data.toUpperCase()}"
    }
}

class NameWithLog(param: String){
    val name: String by LogReadOnlyProperty(param)
}

fun main() {
    val nameWithLog = NameWithLog("Eko Kurniawan")
    println(nameWithLog.name)
    println(nameWithLog.name)
}