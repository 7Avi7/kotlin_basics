import kotlin.math.pow

fun main() {
    
    var fn = :: power
    println(fn(2.0,3.0))
}


fun power(a:Double, b:Double): Double
{
    return a.pow(b)
}