package me.cooper.rick.hackerrank.stringsplit

fun main(args: Array<String>) {
    val isOdd: (Int) -> Boolean = { index -> index % 2 == 1 }
    val numberOfWordsToSplit = readLine()!!.toInt()
    val words = (1..numberOfWordsToSplit).map { readLine() }
    words.forEach {
        println("${it?.filterIndexed { index, _ -> !isOdd(index) }} ${it?.filterIndexed { index, _ -> isOdd(index) }}")
    }
}
