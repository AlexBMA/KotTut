package problem.pack.one


/*
    Write a program that receives n number of seconds
        and returns the max number of hours, minutes and seconds

        7384 => 2 hours 3 minutes and 4 seconds

 */

fun main(args: Array<String>) {
    val seconds = 7384
    convertSecondsToHoursMinutesAndSeconds(seconds)
    convertHoursMinutesAndSecondsToSeconds(1, 3, 4)
}

fun convertSecondsToHoursMinutesAndSeconds(seconds: Int) {
    print("$seconds seconds equals: ")
    if (seconds > 3600) print("Hours: ${seconds / 3600} ")
    val minutes = seconds - ((seconds / 3600) * 3600)
    if (minutes > 60) print("Minutes: ${minutes / 60} ")
    val sec = minutes - ((minutes / 60) * 60)
    println("Seconds: $sec")
}

fun convertHoursMinutesAndSecondsToSeconds(hours: Int, minutes: Int, seconds: Int) {
    val result = seconds + 60 * minutes + 3600 * hours
    println("$hours hours $minutes minutes $seconds seconds equals: $result")
}

