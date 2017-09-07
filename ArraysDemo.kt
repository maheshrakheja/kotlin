import java.util.*

/**
 * Created by MaheshRakheja on 05/09/17.
 */
fun main(args: Array<String>) {

    var arrVal = Array<Int>(5){0}
    /*println(arrVal[1])
    println(arrVal[4])*/
    arrVal[3] = 55
    for (item in arrVal)
    {
        println(item)
    }
    var arrList = ArrayList<String>()
    /*arrList.add("Boil Water")
    arrList.add("Lemon")
    arrList.add("Honey")
    arrList.add("Wife")*/

    /*for(item in 0..arrList.size-1)
    {
        println(arrList.get(item))
    }*/



    for(item in 0..100)
    {
        arrList.add("Missing You")
    }
    for(item in arrList)
    {
        println(item)
    }

}