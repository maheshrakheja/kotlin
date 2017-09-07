/**
 * Created by MaheshRakheja on 06/09/17.
 */
class Choclates()
{
    var type:String? = null
    var cost:Double? = null
    var company:String? = null
    var rawMaterial:String? = null
    var suppiler:String? = null

    init {
        println("This is Default Constructor")
    }
    constructor(type:String,cost:Double,company:String):this()
    {
        this.type = type
        this.cost = cost
        this.company = company
        println("This is Constructor with 3 arguments")
    }
    constructor(rawMaterial:String,suppiler:String):this()
    {
        this.rawMaterial = rawMaterial
        this.suppiler = suppiler
        println("This is Constructor with 2 arguments")
    }
}

fun main(args: Array<String>) {

    var choclate = Choclates()
    var choclate2 = Choclates("Strawberry",1200.00,"Cadberry")
    var choclate3 = Choclates("Milk","Suresh The MilkMan & Company")
    
}