/**
 * Created by MaheshRakheja on 06/09/17.
 */

fun sum(n1:Int,n2:Int):Int
{
    return n1+n2
}
fun display(n1:Int):Unit
{
    println(n1)
}
fun display()
{
    println("Nothing")
}

fun main(args: Array<String>) {

    var addition = sum(10,20)
    display(addition)
    display()
}