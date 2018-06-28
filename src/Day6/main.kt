package Day6


fun String.parseToList(): MutableList<Int> = this.split("\t").map { it.toInt() }.toMutableList()
fun MutableList<Int>.parseToString(): String = this.joinToString("\t")
fun MutableList<Int>.hash(): String = this.joinToString("-")
fun MutableMap<String, Int>.inc(idx: String) {
    this[idx] = this.getOrDefault(idx, 0) + 1
}

// I know i could use just 1 function and return 2 values but i want to be consistend
// and each day has always 2 functions with the same signature even if i need to
// also keep doing that to see how solution changes that's why i dont wanna affect the part I of
// each day

// Part I
fun calculate(data: String): Pair<Int, String> {
    var banks = data.parseToList()
    var hashes = mutableListOf<String>()
    var turn = 0 // turn number

    do {
        var pt = banks.indices.maxBy { banks[it] }!!
        var bankCount = banks[pt]
        //Update for first go
        hashes.add(banks.hash())
        //Remove all elements
        banks[pt] = 0
        while(bankCount-- > 0){
            //Increment bank and move forward
            banks[(++pt % banks.size)] += 1
        }
        turn += 1
    } while (banks.hash() !in hashes)

    return Pair(turn, banks.parseToString())
}

// Part I  WOW with the first try
fun calculate2(data: String): Pair<Int, String>{
    val (cycles, banks) = calculate(data)
    return calculate(banks)
}



fun main(args: Array<String>) {
    //too many words to keep that in code
    var data = "14\t0\t15\t12\t11\t11\t3\t5\t1\t6\t8\t4\t9\t1\t8\t4"


    val (ret, banks) = calculate(data)
    println("Part 1: ${ret} final bank ${banks}")

    val (ret2, banks2) = calculate2(data)
    println("Part 2: $ret2 final bank ${banks2}")

}