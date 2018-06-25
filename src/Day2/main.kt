package Day2

// Parses string formatted array elements separated by /t and rows by /n into int array
// name might be a bit generic but i consider each day as separated being
fun String.parseToArray(): List<List<Int>> = this.lines().map{ it.split("\t").map{it.trim().toInt()}}


// Part I
fun calculate(data: String): Int {
    // Split it nicely
    val intList = data.parseToArray()

    return intList.fold(0){ sum: Int, a: List<Int> -> a.max()!! - a.min()!! + sum}
}


// Part II
fun calculate2(data: String): Int {
    // Split it nicely
    val intList = data.parseToArray()
    // Calculate rest

    return intList.fold(0){sum: Int, a: List<Int> ->
        // idk why labels dont wanna work here that's why i used it2 :(
        sum + a.map{ outIt ->
            a.filter{ outIt % it == 0 && outIt != it}.map{outIt / it}.sum() // could use fold here but it would decrease readability
        }.sum()
    }
}


fun main(args: Array<String>) {
    //keep in mind to keep tabs here not 4 spaces like some IDE does ;)
    val data ="""
		1	2	3
        2	3	4
	 """.trimIndent()

    val ret = calculate(data)
    println("Part 1: $ret")

    val ret2 = calculate2(data)
    println("Part 2: $ret2")

}