fun main() {
    println("Hello Avi".formattedString())
}

fun String.formattedString(): String{
    return "-----------\n$this\n--------------"
}