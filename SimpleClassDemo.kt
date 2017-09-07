/**
 * Created by MaheshRakheja on 06/09/17.
 */

class Dog(twoLegs:String,twoEyes:String,oneNose:String)
{

    var twoLegs:String? = ""
    var twoEyes:String? = ""
    var oneNose:String? = ""

    init {
        this.twoLegs = twoLegs
        this.twoEyes = twoEyes
        this.oneNose = oneNose
    }

    fun twoEars():Unit{
        println(twoLegs)
    }
    fun twoEyes():Unit{
        println(twoEyes)
    }
    fun oneNose():Unit
    {
        println(oneNose)
    }

}

fun main(args: Array<String>) {
    var d = Dog("I am two legs","I am two eyes","I am nose...")
    d.twoEars()
    d.twoEyes()
    d.oneNose()
}
