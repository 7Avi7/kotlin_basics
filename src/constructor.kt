fun main() {

    var human = Human("Avi", 24 , true);
    println(human.name)
    println(human.age)
    println(human.airbag)

}

class Human (nameParam: String, ageParam: Int, hasAirBag:Boolean){
    val name : String = "$nameParam - Clan"
    var age : Int = ageParam
    var airbag:Boolean = hasAirBag
}