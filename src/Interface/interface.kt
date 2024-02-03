fun main() {
    dragObjects(arrayOf(Circle1(4.0), Square(4.0), Triangle(2.0, 3.0),Player("Smiley")))
}

fun dragObjects(objects: Array<Draggable>) {
    for (obj in objects) {
        obj.drag()
    }
}

interface Draggable {
//    val dragSpeed : Int
    fun drag()
}

interface Cloneable{
    fun clone()
}

abstract class Shape1 : Draggable{
    abstract fun area(): Double

}

class Circle1(val radius: Double) : Shape1() {
    override fun area(): Double = Math.PI * radius * radius
    override fun drag() = println("Circle is dragging")
}

class Square(val side: Double) : Shape1() {
    override fun area(): Double = side * side
    override fun drag() = println("Square is dragging")
}

class Triangle(val base: Double, val height: Double) : Shape1() {
    override fun area(): Double = base * height
    override fun drag() = println("Triangle is dragging")
}

class Player (val name: String) : Draggable{
    override fun drag() = println("$name is dragging ")
}