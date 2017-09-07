/**
 * Created by MaheshRakheja on 04/09/17.
 */
fun main(args: Array<String>)
{
    println("Please Enter your Name")
    var name:String = readLine()!!
    println("Please Enter your age")
    var strAge:String = readLine()!!
    var age:Int = strAge.toInt()
    if(age>=18)
    {
        println("You are eligible to open bank account")
        println("Please the amount to want convert from $ to INR")
        var strAmount = readLine()!!
        var amount = strAmount.toDouble()
        if(amount>=100.0)
        {
            println("Bank is not having sufficient funds")
        }
        else
        {
            var convertedAmount = amount * 67
            println("Congratulations !!!\n\n You can convert your amount now")
            print("$name Your amount after conversion will be $convertedAmount")
        }
    }
    else
    {
        println("You are not eligible to open bank account")
    }


}