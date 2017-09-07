/**
 * Created by MaheshRakheja on 06/09/17.
 */
fun main(args: Array<String>) {

    var setcy = setOf<Int>(3,4,5,6,7,10,11,31,442,67,55,88,55,31,88)


    for(item in setcy)
    {
        println(item)
    }

    var hotsetcy = mutableSetOf<String>("Mahesh","Suresh","Ramesh","Ganesh","chiiiiiiiiii","Mahesh","Suresh")

    hotsetcy.add("Reema");
    hotsetcy.add("Seema")

    for (item in hotsetcy)
    {
        println(item)
    }


}