package me.cooper.rick.hackerrank.simplearraysum

fun main(args: Array<String>) {
    readLine()
    println(readLine()!!.split(' ').map { it.toInt() }.sum())
}