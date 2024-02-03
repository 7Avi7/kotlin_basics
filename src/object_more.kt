fun main() {
    SharingWidget.increamentTwLikes()
    SharingWidget.increamentTwLikes()
    SharingWidget.increamentTwLikes()
    SharingWidget.increamentFbLikes()
    SharingWidget.display()

}

object SharingWidget{

   private var twLikes = 0
    private var fbLikes = 0

    fun increamentTwLikes() = twLikes++
    fun increamentFbLikes() = fbLikes++
    fun display() = println("Facebook - $fbLikes -- Twitter - $twLikes")


}