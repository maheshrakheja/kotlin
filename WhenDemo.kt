/**
 * Created by MaheshRakheja on 05/09/17.
 */


fun main(args: Array<String>) {

    println("Please enter your favourite teacher's name")
    var name:String = readLine()!!
    var feedback:String?
    println("Please grade your teacher from 1 to 5")
    var inputStar = readLine()!!.toInt()
    when(inputStar)
    {
        1-> {
            feedback = "Teacher is worst"
            }
        2-> feedback = "Teacher is ok"
        3-> feedback = "Teacher is good, Need some improvement"
        4-> feedback = "Teacher is best, But not perfect"
        5-> feedback = "Teacher is excellent"
        else -> feedback = "No words to describe teacher"
    }
    println("How many lectures delivered by this teacher")
    var lectures = readLine()!!.toInt()
    var lectureFeedback:String?

    when(lectures)
    {
        1,2,3,4 -> lectureFeedback = "Sorry, We feel bad for it"

        in 20..30 -> lectureFeedback = "Ok, We will try to improve"

        !in 0..60 -> lectureFeedback = "Oh!!!!,Extreamly sorry."

        else -> lectureFeedback = "YOu are at wrong place"
    }
    println("Final feedback $name, $feedback, Who delivered $lectures. Based on that we can only say $lectureFeedback")
}