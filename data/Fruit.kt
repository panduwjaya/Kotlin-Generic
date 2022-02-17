package data

class Fruit(val name: String, val quantity: Int) : Comparable<Fruit> {
//class fruit tersebut mengextend/mengimplementasikan interface comparable,yg mana interface comparable menerima input
//fungsi dari memasukan nama class kedalam generic parameter -> Comparable<Fruit>,adalah untuk menentukan dengan class mana class fruit tersebut akan dicomparable/dibandingkan
//berhubung didalam generic parameter Comparable tersebut dimasukan class fruit itu sendiri maka class fruit itu akan dibandingkan dengan class fruit itu sendiri

    override fun compareTo(other: Fruit): Int {//kita bisa mendapatkan function compareTo yg berasal dari implement member dari class Fruit,yang mana class fruit extend interface comparable
        return quantity.compareTo(other.quantity)//ini berasal dari implement comparable number dan integer yg berasal dari tipe data integer pada properties val quantity: Int
        //jadi tipe data int sebenarnya memiliki implement comparable number dan juga comparable integer
    }
}