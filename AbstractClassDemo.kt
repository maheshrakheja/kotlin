/**
 * Created by MaheshRakheja on 06/09/17.
 */
abstract class CreditCard()
{
    fun ccNumber():String
    {
        return "544411611622872787856"
    }
}

class subCreditCard():CreditCard()
{

}

fun main(args: Array<String>) {
    var cc = subCreditCard()
    println("Credit Card number is "+cc.ccNumber() )
}