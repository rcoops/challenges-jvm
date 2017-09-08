package me.cooper.rick.hackerrank.staircase

fun main(args: Array<String>) {
    val size = readLine()!!.toInt()
    (1..size).forEach {
        for(i in 1..(size - it)) print(" ")
        for(i in 1..it) print("#")
        println()
    }
}