/**
 * Created by MaheshRakheja on 05/09/17.
 */
fun main(args: Array<String>) {


    var flag:Boolean = true
    otterloop@ for (item in 1..10)
    {
       /* println("Item before IF Loop $item")
        if(item == 4)
        {
            continue
        }
        //println("Item after IF Loop $item")*/
       innerloop@ for (item2 in 1..10)
        {
            /*if(item2==4)
            {
                break
            }
            println("Item1 is $item and Item2 is $item2")*/

           mostinnerloop@ for(item3 in 1..10)
            {

                if(flag)
                {
                    println("Loop is going on. Do you want to exit")
                    println("1. For exit from outer loop")
                    println("2. For exit from inner loop ")
                    println("3. For exit from most inner loop")
                    var input = readLine()!!.toInt()
                    when(input)
                    {
                        1-> {
                            flag = false
                            break@otterloop
                        }
                        2-> {
                            flag = false
                            break@innerloop
                        }
                        3-> {
                            flag = false
                            break@mostinnerloop
                        }
                        else-> { flag =false
                            print("Executing..")
                        }
                    }

                }
                println("Item1 is $item and Item2 is $item2 and item3 is $item3")


            }
        }
    }
}