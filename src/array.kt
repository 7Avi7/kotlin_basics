fun main() {
    var arr = arrayOf("one","Two", "Three")

    for ((i , e) in arr.withIndex()){
        println("$i - $e")
    }

    println(arr[2])
    println(arr.get(1))

    arr.set(0, "Hello")
    println(arr[0])
    println(arr.size)

}