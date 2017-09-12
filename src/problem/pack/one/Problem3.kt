package problem.pack.one


/*
    Calculate fibonacci the n fibonacci number
    0,1,2,3,5,8,13,21,...
 */


fun main(args: Array<String>) {

    print(calculateFibonacci(10))
}

fun calculateFibonacci(n: Int): Int {
    var a = 0
    var b = 1
    var c = 0
    var i = 1
    while (i < n) {
        i++
        c = a + b
        a = b
        b = c
    }
    return c
}