fun main() {
    val emp = Employee()

    emp.age = 20
    emp.name = "John"

    var x = emp.apply {
        age = 30
        name = "Sean"
    }

println(x)

    emp.let {
        println(it.name)
        println(it.age)
    }


}

data class Employee(var name: String = "", var age : Int = 18)