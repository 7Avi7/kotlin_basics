fun main() {
     val day = Day.Thursday
    println(day)
    println(day.number)

    for(i in Day.values()){
        println(i)
    }
    day.printFormattedDay()

}



enum class Day(val number : Int){
    Monday(1),
    Tuesday(2),
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6),
    Sunday(7);

    fun printFormattedDay(){
        println("day is $this")
    }

}