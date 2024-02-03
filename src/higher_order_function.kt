import kotlin.math.pow

fun main() {
    var fn: (a: Double, b: Double) -> Double = ::sum
    println(fn(2.0, 4.0))

    var fn2: (a: Double, b: Double) -> Double = ::powe
    println(fn2(2.0, 4.0))

    calculator(5.0, 5.0, ::sum)
}

fun calculator(a: Double, b: Double) {

}

fun calculator(a: Double, b: Double, gn: (Double, Double) -> Double) {
    val result = gn(a, b)
    println(result)
}

fun sum(a: Double, b: Double): Double {
    return a + b
}

fun powe(a: Double, b: Double): Double {
    return a.pow(b)
}

fun hello(a: Int): Unit {

}
