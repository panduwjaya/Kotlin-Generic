package Data

//jika seperti disamping maka,class Function <T>(val name: T)
//yang berada didalam scope class function tersebut akan mengikuti tipe data dari <T> class yang memegang scope daerah tersebut
class Function (val name: String){

    //generic function
    fun <T> hello(paramA: T){
        //diluar scope ini maka function ini tidak dapat digunakan atau generic function paramater typenya tidak dapat digunakan pada functiion lain
        println("hello ini,my data is $paramA")
    }

    fun <T> other(paramA: T){
        //function ini tidak terpengaruh dengan function hello diatas
        //karena sudah berbeda scope dengan function hello diatas
        println("hello ini,my secong data is $paramA")
    }
}