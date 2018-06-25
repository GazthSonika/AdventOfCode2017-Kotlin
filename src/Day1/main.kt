package Day1

fun String.parseToIntMutableList(): List<Int> {
    return this.map { it.toString().toInt() }
}

// Part I
fun calculate(data: String): Int {
    // Split it nicely
    val digits = data.parseToIntMutableList()
    // Calculate rest
    return digits.foldIndexed(0) { idx: Int, acc: Int, i: Int ->
        if (i == digits[(idx + 1) % digits.size]) acc + i else acc
    }
}

// Part II
fun calculate2(data: String): Int {
    // Split it nicely
    val digits = data.parseToIntMutableList()
    // Calculate rest
    return digits.foldIndexed(0) { idx: Int, acc: Int, i: Int ->
        if (i == digits[(idx + digits.size / 2) % digits.size]) acc + i else acc
    }
}


fun main(args: Array<String>) {
    var data = "1233211"

    // Part I
    val res = calculate(data)
    println("Part I: $res")

    // Part II
    val res2 = calculate2(data)
    println("Part II: $res2")
}