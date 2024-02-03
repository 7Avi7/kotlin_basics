fun main() {

    val tile: Tile = Red ("Mashroom", 25)
//    val tile2 = Red ("Fire", 30)
//    println("${tile.points} - ${tile.type}")
    val points = when (tile){
        is Blue -> tile.points * 2
        is Red -> tile.points * 5
    }

    println(points)

}



sealed class Tile
class Red (val type: String , val points : Int ) : Tile ()
class Blue (val points : Int): Tile()