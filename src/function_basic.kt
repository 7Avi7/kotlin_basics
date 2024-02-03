fun main() {
    val result = add(num1 = 3 , num2 = 6)

    println(result)

    evenOrOdd(num3 = 33)
    evenOrOdd(num3 = 32)

}



fun add(num1: Int,num2:Int): Int
{

val sum = num1 + num2
    return  sum

}

fun evenOrOdd(num3: Int){
    val  result = if (num3 %2 == 0 ) "Even" else "odd"
    println(result)
}