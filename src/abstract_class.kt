fun main() {

    val circle = Circle(4.0)
    println(circle.area())
    circle.display()


}

abstract class A{
    fun method1(){
        println("I am method 1")
    }
}

abstract class Shape {
    var name: String= ""
    abstract fun area (): Double
    abstract fun display()
}

class Circle (val radius: Double) : Shape(){
    override fun area(): Double = Math.PI * radius * radius
    override fun display() {
        println("Circle is getting Display")
    }
}
