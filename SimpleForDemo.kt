/**
 * Created by MaheshRakheja on 05/09/17.
 */
fun main(args: Array<String>) {
    var sentence:String = readLine()!!
    var arrNAmes = ArrayList<String>()

    arrNAmes.add("Mahesh")
    arrNAmes.add("Reema")
    arrNAmes.add("Seema")

    for(i in 1..100)
    {
        println("$sentence")

    }
    for(index in 0 .. arrNAmes.size-1)
    {
        println(arrNAmes.get(index))
    }
    for(element in arrNAmes)
    {
        println(element)
    }
}