/**
 * Created by MaheshRakheja on 05/09/17.
 */

fun main(args: Array<String>) {

    var map = HashMap<Int,String>()
    map.put(0,"Mahesh")
    map.put(20,"Rakheja")
    map.put(31,"Sona")
    map.put(44,"Mona")
    map.put(55,"Jannu")

    //println(map.get(44))
    //println(map.get(20))

    for(item in map.keys)
    {
        println(map.get(item))
    }

}