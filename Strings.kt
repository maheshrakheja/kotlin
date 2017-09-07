/**
 * Created by MaheshRakheja on 05/09/17.
 */
fun main(args: Array<String>) {

    var name:String = "   Mahesh   "

    println("First Char "+name[3])

    var fullname = name+" Rakheja   "
    println("Fullname "+fullname)
    println("With trim:"+name.trim()+"Rakheja")
    println("Without trim:"+name+"Rakheja")
    println("Fullname with trim"+fullname.trim())
    var splitedName = fullname.split(" ")
    println("Name "+splitedName[0])
    println("Last name "+splitedName[1] )
    println(fullname.toUpperCase())
    println(fullname.toLowerCase())
    if(fullname.trim().endsWith("Rakheja"))
    {
        println("Ending with Rakheja")
    }
    else
    {
        println("Ending with something else")
    }

}