/**
 * Created by MaheshRakheja on 05/09/17.
 */

fun displayReply(age:Int)
{
    var reply:String? = when(age){

        in 18..27->"Lets go for date"
        else -> "Forget about it dear, Go to HEll..."
    }
    println(reply)
}


fun main(args: Array<String>) {

    println("Enter the number of gifts by REEMA")
    var giftsReema = readLine()!!.toInt()
    println("Enter the number of gifts by SEEMA")
    var giftsSeema = readLine()!!.toInt()
    var finalGifts = if(giftsReema>giftsSeema) giftsReema else giftsSeema
    if(finalGifts == giftsReema)
    {
        println("What is your age Reema?")
        var age = readLine()!!.toInt()
        displayReply(age)
    }
    else
    {
        println("What is your age SEEMA?")
        var age = readLine()!!.toInt()
        displayReply(age)
    }


}