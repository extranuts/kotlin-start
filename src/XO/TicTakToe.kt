package XO

fun main() {
    play(GameImpl())
}

fun play(game: Game) {
    while (!game.isFinished) {
        render(game.field)
        println("Your turn: ")
        val input = readLine() ?: error("Can't read line")
        val points = input.split(" ").map { it.toInt() }  //TODO: validate
        game.act(points[0], points[1])
    }
}
//
//fun render(field: Array<Array<Boolean?>>) {
//
//}

fun render(field: Field) {
    repeat(field.size) { row ->
        repeat(field.size) { col ->
            print("[ ${field.get(row, col)} ] ")
        }
        println()
    }

}


interface Game {
    val isFinished: Boolean
    val field: Field
    fun act(row: Int, col: Int)
}

interface Field {
    val size: Int
    fun get(row: Int, col: Int): Boolean?
}

class GameImpl : Game {
    override val isFinished: Boolean = false
    override val field: Field = ArrayField(3)

    override fun act(row: Int, col: Int) {

    }

}


class ArrayField(override val size: Int) : Field {

    private val points: Array<Array<Boolean?>> = Array(size) { arrayOfNulls(size) }

    override fun get(row: Int, col: Int): Boolean? = points[row][col]
}