fun main() {
    var gender : String = "Male"
    var gender2 : String? = null
    var isAdult : Boolean? = true


    if (gender2 != null) {
        println(gender2.uppercase())
    }

    println(gender2!!.uppercase())

}