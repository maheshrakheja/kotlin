import java.io.FileReader
import java.io.FileWriter

/**
 * Created by MaheshRakheja on 07/09/17.
 */
fun writeToFile(filename:String,data:String):Unit{
    try {
        var fo = FileWriter(filename, true)
        fo.write(data)
        fo.close()
    }
    catch (e:Exception)
    {
        println(e.message)
    }
}
fun readFromFile(filename:String)
{
    try {
        var fin = FileReader(filename)
        println(fin.readText())
        /*var c: Int?
        do {
            c = fin.read()
            print(c.toChar())
        } while (c != -1)*/
    }
    catch (e:Exception)
    {
        println(e.message)
    }
}

fun main(args: Array<String>) {
    println("Please enter data to write or read")

    loop@while (true)
    {
        println("1. To Write into file")
        println("2. To Read from file")
        println("3. To Exit")
        var options = readLine()!!.toInt()
        when(options)
        {
            1->{
                println("Please enter filename")
                var filename = readLine()!!
                println("Please enter data to write")
                var data = readLine()!!
                writeToFile(filename,data)
                println("Data written successfully...")
            }
            2->{
                println("Please enter filename")
                var filename = readLine()!!
                readFromFile(filename)
            }
            3->{
              break@loop
            }
            else ->
            {
                println("Invalid Option")
            }
        }


    }
}