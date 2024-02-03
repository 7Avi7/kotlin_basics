

fun main() {




    val arr  = arrayOf(1,2,3)

    try {
        println(arr[5])
    }
    catch (e:Exception){
        println("Please check the air index ")
    }
    finally {
        println("I will execute no matter what")
    }

    println("This will not run")




createUserList(5)
createUserList(-2)

}
fun createUserList(count:Int){
    if(count<0){
        throw IllegalArgumentException("Count Must Be Greater Tha Zero")
    }else{
        println("User  List Created containing $count users")
    }
}