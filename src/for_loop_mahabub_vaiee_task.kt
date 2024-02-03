fun main(){

    var num = arrayOf(1,2,10,2,5,50,60,90,100,101,102)
//    println(num.size)
    for(i in 0 .. num.size-1){
        if (num[i] >= 10 &&  num[i] <= 100){
            if (num[i]%2 == 0){
                println(num[i])
            }
        }
    }


}