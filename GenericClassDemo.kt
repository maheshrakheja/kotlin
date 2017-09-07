/**
 * Created by MaheshRakheja on 06/09/17.
 */
class PrintMyData<T>(n1:T)
{
    init {
        println(n1)
    }
    fun operate(n1:T,n2:T):Unit{


    }
}

fun main(args: Array<String>) {
    var value = PrintMyData<String>("Mahesh")
   var value2 = PrintMyData<Int>(12)
    value2.operate(12,12)
}