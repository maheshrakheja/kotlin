/**
 * Created by MaheshRakheja on 06/09/17.
 */


class Outter(){

    fun ShowMyTextOutter(n1:String)
    {
        println(n1)
    }
   inner class Nested()
    {
        fun ShowMyText(n1:String)
        {
            println(n1)
        }
    }
}

fun main(args: Array<String>) {
    var out = Outter()
    out.ShowMyTextOutter("This is my outtre text")
    var nested = Outter().Nested()
    nested.ShowMyText("This is my inner test")
    out.Nested().ShowMyText("This is inner again")

}