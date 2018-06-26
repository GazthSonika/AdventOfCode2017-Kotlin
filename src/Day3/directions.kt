package Day3


abstract class Direction{
    abstract fun walk(position: Position): Position
    abstract fun next(): Direction
}

object Up: Direction() {
    override fun walk(position: Position): Position = Position(position.first, position.second+1)
    override fun next(): Direction = Left
}

object Left: Direction() {
    override fun walk(position: Position): Position = Position(position.first-1, position.second)
    override fun next(): Direction = Down
}

object Down: Direction() {
    override fun walk(position: Position): Position = Position(position.first, position.second-1)
    override fun next(): Direction = Right
}

object Right: Direction() {
    override fun walk(position: Position): Position = Position(position.first+1, position.second)
    override fun next(): Direction = Up
}

