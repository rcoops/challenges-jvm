package me.cooper.rick.hackerrank.comparethetriplets

fun main(args: Array<String>) {
    val firstTriplet = readLine()!!.split(' ').map { it.toInt() }
    val secondTriplet = readLine()!!.split(' ').map { it.toInt() }
    val zippedTriplets = firstTriplet zip secondTriplet
    val results = zippedTriplets.foldRight(Pair(0,0)) { pair, (first, second) ->
        Pair(adjustTotal(first, pair), adjustTotal(second, pair.swap()))
    }
    println("${results.first} ${results.second}")
}

private fun adjustTotal(total: Int, pair: Pair<Int, Int>): Int {
    return total + pair.first.compareTo(pair.second)
}

fun <T> Pair<T, T>.swap(): Pair<T, T> {
    return Pair(this.second, this.first)
}