/**
 * Created by MaheshRakheja on 06/09/17.
 */
enum class MyCalender{
    YEAR,MONTH,DATE,DAY,MINUTE,SECONDS
}
class test
{
    var date = MyCalender.DATE

    fun checkCalender()
    {
        if(MyCalender.MONTH == MyCalender.DAY)
        {
            println("Wow its there..")
        }
        else{
            println("Hello, Dear I am working...")
        }
    }
}