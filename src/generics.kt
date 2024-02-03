fun main() {
    val iContainer =  Container1(3)
    iContainer.getVAlue()
    println(iContainer.getVAlue())

    val sContainer =  Container1("Hello Avi")
    sContainer.getVAlue()
    println(sContainer.getVAlue())

}

class  Container1<T> (var data: T) {
    fun setValue(value: T){
        data = value
    }

    fun getVAlue(): T {
        return  data
    }

}