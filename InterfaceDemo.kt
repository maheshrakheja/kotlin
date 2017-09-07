/**
 * Created by MaheshRakheja on 06/09/17.
 */
interface event{
    fun marriage(name1:String,name2:String)
}

class CommonGender:event
{
    override fun marriage(name1: String, name2: String) {
        println("$name1 is going $name2")
        println("Congratulations $name1 & $name2")
    }
}
class UniqueGender:event
{
    override fun marriage(name1: String, name2: String) {
        println("$name1 is going $name2")
        println("Congratulations $name1 & $name2")
        println("Its very difficult for you to survive...")
    }
}

fun main(args: Array<String>) {
    var common = CommonGender()
    common.marriage("Suresh","Kajal Agarwal")
    var unique = UniqueGender()
    unique.marriage("Suresh","Akhil")
}