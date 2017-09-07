package problem.pack.one


/*
    Write a program that receives n number of seconds
        and returns the max number of hours, minutes and seconds

        7384 => 2 hours 3 minutes and 4 seconds

 */

fun main(args: Array<String>): Unit {

    var seconds = 7384

}

fun convert(seconds: Int) {

    if (seconds > 3600) println("Hours: ${seconds / 3600}")

    var temp = seconds - ((seconds / 3600) * 3600)

    if (temp > 60) println("Minutes")
}