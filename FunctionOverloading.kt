/**
 * Created by MaheshRakheja on 06/09/17.
 */

fun sumy(n1:Int,n2:Int):Int
{
    return n1+n2
}
fun sumy(n1:Int,n2:Int,n3:Int):Int
{
    return n1+n2+n3
}
fun sumy(n1:Int,n2:Int,n3:Int,n4:Int):Int
{
    return n1+n2+n3+n4
}
fun sumy(n1:Int,n2:Int,n3:Int,n4:Int,n5:Int):Int
{
    return n1+n2+n3+n4+n5
}

fun main(args: Array<String>) {

    println(sumy(10,20))
    println(sumy(10,20,30))
    println(sumy(10,20,30,40))
    println(sumy(10,20,30,40,50))
    println(sumy(10,20,30,40,50))
    println(sumy(10,20))

}