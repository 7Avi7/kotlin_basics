fun main() {

    val onePlus = OnePlus("Smart Phone")


    onePlus.display()
    println(onePlus.name)

    val generalMobile = Mobile("General")
    generalMobile.display()


    println(onePlus.toString())

}

open class Mobile (val type : String){
    open val name : String = ""
    val size : Int = 5
    fun makeCall () = println("Calling From Mobile")
    fun powerOff () = println("String Down")
    open fun display  () = println("Simple Mobile Display")
}


class OnePlus (typeParam : String): Mobile (typeParam){

    override val name : String = "Override Name One Plus"
    override  fun display () {
        super.display()
        println("One Plus Display")
    }

    override fun toString(): String {
        return "OnePlus(name='$name')"
    }

}