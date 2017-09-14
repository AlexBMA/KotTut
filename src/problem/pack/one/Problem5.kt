package problem.pack.one

/*

    Calculate n!
    n! = (1*2*3*...*n)

 */

fun main(args: Array<String>) {

    val n = 13
    calculateN(n)
}

fun calculateN(n: Int): Int {

    var rez = 1
    for (number in 1..n) {
        rez *= number
    }
    return rez
}