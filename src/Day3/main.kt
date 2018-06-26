package Day3

import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.sqrt



// Part I
fun calculate(data: Long): Long {
    val areaNo = ceil(floor(sqrt(data.toDouble())) / 2).toInt()
    val fieldNo = (data - 1) % (2 * areaNo)
    val distance = abs(fieldNo - areaNo) + areaNo
    return distance
}

// Part II


fun calculate2(data: Long): Long {
    //can assume that size of grid is less then [a; a] where a = sqrt(data)
    return Grid().calculateUntil( data)

}


fun main(args: Array<String>) {

    val data = 6915270000000000000

    val ret = calculate(data.toLong())
    println("Part 1: $ret")

    val ret2 = calculate2(data.toLong())
    println("Part 2: $ret2")

}