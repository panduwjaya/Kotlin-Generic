package Data

//multiple parameter type
//parameter type di generic boleh lebih dari satu

class MyDataMultiple<T, U>(val firstData: T, val secondData: U) {
    fun getData(): T = firstData //penulisan fun boleh seperti ini
    fun getDataSecond(): U {    //penulisan fun boleh seperti ini
        return secondData
    }


    fun printlnData(){
        println("Data is $firstData and $secondData")
    }
}