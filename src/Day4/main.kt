package Day4

import java.io.File


fun String.parseToList(): List<List<String>> = this.lines().map{ it.split(" ")}

// Part I
fun calculate(data: String): Int = data.parseToList().filter{ it.size == it.distinct().size}.size

//// Part II
fun calculate2(data: String): Int = data.parseToList().filter{
    it.size == it.distinctBy{ it.split("").sorted().joinToString("")}.size
}.size


fun main(args: Array<String>) {
    //too many words to keep that in code
    var data = File("data/Day4/data.txt").readText()

    val ret = calculate(data)
    println("Part 1: ${ret} ")

    val ret2 = calculate2(data)
    println("Part 2: $ret2")

}