package problem.pack.one


/*
    Write a program that converts miles in km  and km in miles
    1 mile = 1.6;
 */

fun main(args: Array<String>): Unit {

    println(convertMilesInKm(2.0))
    println(convertKmInMiles(4.0))
}

fun convertMilesInKm(miles: Double): Double {
    return 1.6 * miles
}

fun convertKmInMiles(km: Double): Double {
    return km * 0.6
}

