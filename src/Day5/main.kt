package Day5

import java.io.File


fun String.parseToList(): MutableList<Int> = this.lines().map{ it.trim().toInt() }.toMutableList()

// Part I  WOW with the first try
fun calculate(data: String): Int {
    var jumps = data.parseToList()
    var pt = 0
    var step = 0
    while (pt >= 0 && pt < jumps.size){
        pt += jumps[pt]++
        step += 1
    }

    return step
}

// Part I  WOW with the first try
fun calculate2(data: String): Int {
    var jumps = data.parseToList()
    var pt = 0
    var step = 0

    while (pt >= 0 && pt < jumps.size){
        var tmp = pt
        pt += jumps[tmp]
        jumps[tmp] += if (jumps[tmp] >= 3) -1 else 1
        step += 1
    }

    return step
}


fun main(args: Array<String>) {
    //too many words to keep that in code
    var data = File("data/Day5/data.txt").readText()

    val ret = calculate(data)
    println("Part 1: ${ret} ")

    val ret2 = calculate2(data)
    println("Part 2: $ret2")

}