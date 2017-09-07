/**
 * Created by MaheshRakheja on 07/09/17.
 */
class Singleton(){

    init
    {
        println("I am called, Default...")
    }
    var name:String? = null

    companion object {
        val instance:Singleton by lazy { Singleton() }
    }
}

fun main(args: Array<String>) {
    var sin1 = Singleton.instance
    sin1.name = "Mahesh"
    println("Object 1 "+sin1.name)
    var sin2 = Singleton.instance
    println("Object 2 "+sin2.name)
    var sin3 =Singleton.instance
    println("Object 3"+sin3.name)
}