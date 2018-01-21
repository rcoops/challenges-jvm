package me.cooper.rick.hackerrank.arrays

fun main(args: Array<String>) {
    val (_, array) = (1..2).map { readLine()!!.split(" ") }
    println(array.reversed().joinToString(" "))
}
