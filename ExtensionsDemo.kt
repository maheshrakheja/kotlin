/**
 * Created by MaheshRakheja on 06/09/17.
 */


fun ArrayList<String>.swap(n1:Int,n2:Int)
{
    var temp = this.get(n1)
    this.set(n1,this.get(n2))
    this.set(n2,temp)
}
fun ArrayList<String>.appendAll(n1:String)
{
    for(item in 0..this.size-1)
    {
        var balue = this.get(item)
        this.set(item,balue+n1)
    }
}


fun main(args: Array<String>) {

    var arrNames = ArrayList<String>()
    arrNames.add("Mahesh")
    arrNames.add("Suresh")
    arrNames.add("Ramesh")

    println("***BEFORE SWAP***")
    for(item in arrNames)
    {
        println(item)
    }
    arrNames.swap(0,1)

    println("***After Swaping***")
    for(item in arrNames)
    {
        println(item)
    }

    arrNames.appendAll(" Rakheja")

    println("***After Appending***")
    for(item in arrNames)
    {
        println(item)
    }
}