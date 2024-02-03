fun main(){
    var language = arrayOf("Ruby", "Kotlin", "Python", "Java")

    for (item in  language.indices){
        if(item%2 == 0){
            println(language[item])
        }
    }


}