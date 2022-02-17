package directory

//GENERIC CONSTRAINT
//kadang kita ingin membatasi data yang boleh digunakan di generic parameter type
//kita bisa menambahkan constraint di generic parameter type dengan menyebutkan tipe yang diperbolehkan
//secara otomatis type data yang bisa digunakan adalah type yang sudah kita sebutkan atau class-class turunannya
//secara default constraint type atau type data untuk generic parameter type adalah Any,sehingga semua tipe data bisa digunakan

open class Employes

class Managers : Employes()

class CoPresident : Employes()

class Corporate<T : Employes>(val employes: T)//artinya hanya class Employes dan class turunannya saja yang bisa digunakan di generic parameter type
//secara default constraint type atau type data untuk generic parameter type adalah Any,sehingga semua tipe data bisa digunakan contoh "Corporate<T>" == "Corporate<T : Any>"

fun main(){
    val data1 = Corporate(Employes())
    val data2 = Corporate(Managers())
    val data3 = Corporate(CoPresident())
    //val data4 = Corporate("String") ini eror karena yg bisa digunakan untuk generic type parameter merupakan class Employes atau class turunannya tidak semua data bisa dimasukan
}