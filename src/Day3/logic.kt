package Day3

typealias Position = Pair<Int, Int>


class Player {

    var position = Position(0, 0)
    var direction: Direction = Right
    var step = 0 // current step in row
    var stepsInRow = 1  // initial number of steps
    var seqToSwitch = 2  // after 2 changes we increase number of steps in row

    // ugly one :(
    fun walk(): Pair<Int, Int> {
        position = direction.walk(position)
        step += 1
        if (step >= stepsInRow) {
            seqToSwitch -= 1
            step = 0
            direction = direction.next()
            if (seqToSwitch == 0) {
                stepsInRow += 1
                seqToSwitch = 2
            }
        }

        return position
    }
}

class Grid {

    var grid = mutableMapOf<String, Long>() //looks like that ways is bit faster
    var player = Player()

    constructor() {
        // initial grid value
        grid[genKey(Position(0, 0))] = 1
    }

    fun calculateSum(pos: Position): Long =
            (pos.first - 1..pos.first + 1).flatMap { x -> (pos.second - 1..pos.second + 1).map { y -> getEle(Pair(x, y)) } }.sum()

    private fun getEle(pos: Position): Long = grid.getOrDefault(genKey(pos), 0)
    private fun genKey(pos: Position): String = "${pos.first}-${pos.second}"

    /**
     * Calculates closest bigger value
     */
    fun calculateUntil(desiredVal: Long): Long {
        var sum: Long
        do {
            var position = player.walk() // generators?
            sum = calculateSum(position)
            grid[genKey(position)] = sum
        } while (sum < desiredVal)

        return sum
    }

}