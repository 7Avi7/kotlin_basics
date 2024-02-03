import java.util.*

fun main() {
    val p1 = Per("avi", 24)

    println(p1.age)
    p1.age = -12
    println(p1.name)

}
class Per(nameParam:String, ageParam: Int){

    var name : String = nameParam


        get(){
            println("Name getter is called")
            return field.uppercase()
        }

    var age : Int = ageParam
        set (value){
            if(value > 0){
                field =value
            }
            else{
                println("Age can't be negative")
            }
        }



}