package XO

fun main() {
    println("Welcome to TicTacToe game")
}

fun play(game: Game) {
    //render
    //get input
    //act

}

fun render(field: Array<Array<Boolean?>>) {

}

interface Game {
    val field: Array<Array<Boolean?>>
    fun act(row: Int, col: Int)
}

interface Field {
    val size: Int
    fun get(row: Int, col: Int): Boolean?
}