/**
 * Created by MaheshRakheja on 05/09/17.
 */
fun main(args: Array<String>) {

    var map = hashMapOf<Int,String>(1 to "Mahesh",2 to "ganesh",44 to "Suresh")
    map.put(66,"Rohit")

    var arrData = arrayOf<String>("Mahesh","Sures","Ganesh","Ramesh","Jignesh","Rohit","Sharma","Kohli","Junior NTR")
    println(arrData[0])
    arrData[0] = "Love Ko Mar"
    println(arrData[0])

    var list = mutableListOf<String>("Mahesh","Suresh","Ganesh")
    println(list[0])
    list[0] = "Suree"

}