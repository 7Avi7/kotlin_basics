fun main() {
     val mustang = Car("mustang","Petrol", 300)

    println(mustang.name)
    println(mustang.type)
    mustang.driveCar()
    mustang.applyBreaks()

}


class Car (val name: String, val type : String, var kmRan: Int){

    fun driveCar(){
        println("$name Car is driving")
    }

    fun applyBreaks(){
        println("Applied Breaks")
    }


}