fun main() {
    var fn: (a: Double, b:Double) -> Double = :: addition3
    println(fn(1.0,2.0))
}

fun addition3(a:Double, b:Double):Double{


    return  a+b

}
