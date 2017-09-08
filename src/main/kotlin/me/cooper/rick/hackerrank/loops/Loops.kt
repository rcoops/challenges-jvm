package me.cooper.rick.hackerrank.loops

fun main(args: Array<String>) {
    val input = readLine()!!.toInt()
    (1..10).forEach { println("$input x $it = ${input * it}") }
}