fun main() {


    var car = AutoMobile("Car", "Petrol", )
    var car2 = AutoMobile("Car2", "Petrol")
    println(car.name)
    println(car.tyres)
    println(car.tyres)
    println(car.engineType)
    println(car.maxSeating)

}


class AutoMobile (val name : String , val tyres : Int , val maxSeating : Int , val engineType: String ) {

    init {
        println("$name is Created")

    }
    init {
        println("2nd Initializer Block")

    }

    constructor(nameParam : String, engineParam: String ):this (nameParam, 4,5,"petrol")


    fun drive(){}
    fun applyBreaks(){}


}