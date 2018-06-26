package Day3

typealias Position = Pair<Int, Int>

class Player {
    var position = Position(0, 0)

    var direction: Direction = Right

    var step = 0
    var stepsInRow = 1
    var seqToSwitch = 2

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

    var grid = mutableMapOf<String, Int>()
    var player = Player()

    constructor() {
        grid[genKey(Position(0, 0))] = 1
    }

    fun calculateSum(pos: Position): Int =
            (pos.first - 1..pos.first + 1).flatMap { x -> (pos.second - 1..pos.second + 1).map { y -> getEle(Pair(x, y)) } }.sum()

    fun getEle(pos: Position): Int = grid.getOrDefault(genKey(pos), 0)
    fun genKey(pos: Position): String = "${pos.first}-${pos.second}"

    /**
     * Calculates closest bigger value
     */
    fun calculateUntil(desiredVal: Int): Int {
        var sum: Int
        do {
            var position = player.walk() // generators?
            sum = calculateSum(position)
            grid[genKey(position)] = sum
        } while (sum < desiredVal)

        return sum
    }

}