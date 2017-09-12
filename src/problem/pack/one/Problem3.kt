package problem.pack.one


/*
    Calculate fibonacci the n fibonacci number
    0,1,2,3,5,8,13,21,...
 */


fun main(args: Array<String>) {

    println(calculateFibonacci(10))

    println(calculateFibonacciRecursive(10, 0, 1))
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

fun calculateFibonacciRecursive(n: Int, a: Int = 0, b: Int = 1): Int {
    if (n == 0) return a
    if (n == 1) return b
    return calculateFibonacciRecursive(n - 1, b, a + b)
}