/**
 * Created by MaheshRakheja on 04/09/17.
 */


fun main(args: Array<String>)
{
    println("Please Enter your Name?")
    var name:String = readLine()!!
    println("Please Enter your mobile number")
    var number:String = readLine()!!
    var lnum:Long = number.toLong()
    println("Please Enter your Roll number")
    var rollno:Int = readLine()!!.toInt()
    println("Please Enter your Age?")
    var age:String = readLine()!!

    println("**** YOur Data ***")

    println("Your name " + name)
    println("Your mobile number $number")
    println("Your roll number $rollno")
    println("Your age $age")

}