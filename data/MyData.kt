package Data

//penggunaan <T> karena sebagai pengganti dari tipe data atau generic type jadi tipe data dapat ditentukan setelahnya
//ini (<T>) disebut sebagai diamond opertor

class MyData<T>(val firstData: T){
    //fungsi dari fun ini adalah mengubah deklarasi dari isi constructor pada class
    fun getData(): T = firstData

    fun printlnData(){
        println("Data is $firstData")
    }

    //selain fungsi isi member dari generic class dapat berupa properties
    var nama: T = firstData
}