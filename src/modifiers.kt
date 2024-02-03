fun main() {
    val obC = C()
    val obB = B()

    obC.p
    obC.r


    obB.p
    obB.r
    obB.test()

}

 open class C {
    public  var p = 10
    private  var q = 20
    internal var r = 30
    protected var s = 40
}

class B : C(){
    fun test(){
        println(p)
//        println(q)
        println(r)
        println(s)
    }
}