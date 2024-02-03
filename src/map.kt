fun main() {
    val students = mutableMapOf<Int,String>()
    students.put(1,"Avi")
    students.put(2,"Abdullah")
    students.put(3,"Dos")

    println(students.get(3))
    println(students.get(11 ))

    for ((key,value) in students){
        println("$key = $value")
    }

    students[8] = "Mash"

    println(students)

    println(students[8])

    val map = mapOf(1 to "Hello", 2 to "World")

    println(map)

}