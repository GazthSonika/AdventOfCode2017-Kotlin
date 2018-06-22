package Day1

fun calculate(data: String): Int{
    // Split it nicely
    val digits: MutableList<Int> = data.map { it.toString().toInt() }.toMutableList()
    // Calculate rest
    return digits.foldIndexed(0) {
        idx: Int, acc: Int, i: Int -> if (i == digits[(idx + 1) % digits.size])acc + i else acc
    }
}

fun main(args: Array<String>){
    val res = calculate("Your code here")
    println(res)
}