package directory

import Data.MyData
import Data.MyDataMultiple

//generic class bertujuan agar kita tidak perlu menjelaskan secara eksplisit tipe data seperti pada any class
//generic type adalah class atau interface yang memiliki parameter
//generic dapat tidak hanya dapat dilakukan di dalam class namun juga dapat dilakukan didalam interface
/**tidak ada ketentuan dalam pembuatan generic parameter type,namun biasanya kebanyakan orang menggunakan 1 karakter sebagai
 * sebagai generic parameter type
 */
//(val firstData: T) ini yang disebut sebagai generic parameter type1e

/**dalam penulisan nama generic type yang biasa digunakan adalah:
 * E - element (biasa digunakan di collection atau data struktur yaitu array dll)
 * K - key
 * N - number
 * T - type
 * v - value
 * S,U,V etc - 2nd,3rd,4th types
 */

fun main() {
    val myData: MyData<String> = MyData<String>("Pandu")//tipe data dapat kita tentukan dengan mudah sesuai keinginan kita
    myData.printlnData()

    val myDataInt: MyData<Int> = MyData(100)//kita juga tidak perlu menuliskan MyData<Int>(100) secara jelas
    myData.printlnData()

    //multiple parameter type
    val myMultiple: MyDataMultiple<String, Int> = MyDataMultiple("Pandu",100)
    myMultiple.printlnData()
}