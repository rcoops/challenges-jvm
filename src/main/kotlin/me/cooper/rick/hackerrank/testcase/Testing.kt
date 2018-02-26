package me.cooper.rick.hackerrank.testcase

fun main(args: Array<String>) {
    println(5)
    printTestCase(4, 3, arrayOf(-1, 0, 4, 2))
    printTestCase(5, 2, arrayOf(0, -1, 2, 1, 4))
    printTestCase(7, 6, arrayOf(2, 0, -1, 1 , 1 , 1, 1))
    printTestCase(3, 1, arrayOf(-1, 0, 4))
    printTestCase(6, 4, arrayOf(0, -1, 1, 4, 5, 6))
}

private fun printTestCase(n: Int, k: Int, arr: Array<Int>) {
    println("$n $k\n${arr.joinToString(" ")}")
}