fun main() {
    var fn: (a: Int, b: Int) -> Int = ::sum2
    val lambda1 = {x: Int, y:Int -> x + y}
    val multiLineLambda = {
        println("Hello Lambda")
        val a = 2 + 3
        "Hello Avi"
        println(a)
        2
    }

    multiLineLambda()
    println(multiLineLambda())

    val singleParamLambda = {x: Int -> x * x}
    val lambda2 : (Int) -> Int = {x -> x * x}

    val sayHi = {msg: String -> println("Hello $msg") }
    val sayHi2: (String) -> Unit = {msg -> println("Hello $msg") }


    calculator2(1,2) {a,b -> a + b}



}
fun sum2(a: Int, b: Int): Int = a+b

fun calculator2(a: Int, b: Int, op: (Int,Int) -> Int): Int {
    return op(a,b)
}

