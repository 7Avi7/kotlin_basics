fun main() {
    println(D.num)
    E.test()
}


object  D {
    val num : Int = 10

}


object E {
    val p : Int = 20
    fun test () {
        println("I am from Object E")
    }
}