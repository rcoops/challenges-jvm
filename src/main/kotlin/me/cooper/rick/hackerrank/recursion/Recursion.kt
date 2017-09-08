package me.cooper.rick.hackerrank.recursion

fun main(args: Array<String>) {
    val inputNum = readLine()!!.toInt()
    println(factorial(inputNum))
}


tailrec fun factorial(num: Int, factorial: Int = 1): Int {
    return if(num == 1) factorial else factorial(num - 1, num * factorial)
}
