/**
 * Created by MaheshRakheja on 06/09/17.
 */

open class Operations()
{
    open fun sum(n1:Int,n2:Int):Int
    {
        println("I am from super class")
        return n1+n2
    }

    fun minus(n1:Int,n2:Int):Int{
        return n1-n2
    }
}
class MultiOperations():Operations()
{

    /*override fun sum(n1:Int,n2:Int):Int
    {
        super.sum(n1, n2)
        println("I am from subclass")
        return n1+n2-3
    }*/

    fun div(n1:Int,n2:Int):Int
    {
        return n1/n2
    }

    fun multiply(n1:Int,n2:Int):Int{
        return n1*n2
    }

}

fun main(args: Array<String>) {
    var op = Operations()
    var multiOp = MultiOperations()

    var sum = multiOp.sum(10,20)
    var minus = multiOp.minus(10,20)
    var div = multiOp.div(30,20)
    var multiply = multiOp.multiply(20,20)
    var opx = multiOp as Operations
    var output =opx.sum(10,20)
    println("OUTPUT: $output" )

    println("Sum is $sum")
    println("Minus is $minus")
    println("Div is $div")
    println("Multiply is $multiply")



}
