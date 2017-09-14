package problem.pack.one

/*
    Greatest common divisor (GCD) of two numbers
    using euclid algorithm
 */
fun main(args: Array<String>) {

    val a = 21
    var b = 30

    print(gcdEuclid(a, b))
}

fun gcdEuclid(a: Int, b: Int): Int {
    if (a == 0) return b
    if (b == 0) return a

    if (a > b) {
        val r = a % b
        return gcdEuclid(b, r)
    } else {
        var r = b % a
        return gcdEuclid(a, r)
    }
}