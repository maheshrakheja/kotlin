/**
 * Created by MaheshRakheja on 07/09/17.
 */
class MyThread():Thread()
{
    var threadName:String? = null
    constructor(threadName:String):this()
    {
     this.threadName = threadName
    }

    override fun run()
    {
        for(item in 1..10)
        {
            println("$threadName is running $item")
            Thread.sleep(1000)
        }
    }

}

fun main(args: Array<String>) {
    var myThread = MyThread("BMW")
    myThread.start()
    myThread.join()
    var myThread2 = MyThread("LEnovo")
    myThread2.start()
    myThread2.join()
    var myThread3 = MyThread("Samsung")
    myThread3.start()
    myThread3.join()
    var myThread4 = MyThread("Nokia")
    myThread4.start()
    myThread4.join()
    var myThread5 = MyThread("Microsoft")
    myThread5.start()
    myThread5.join()
    var myThread6 = MyThread("Junior NTR")
    myThread6.start()
    myThread6.join()
}