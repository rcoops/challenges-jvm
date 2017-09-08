package me.cooper.rick.hackerrank.operators

import java.lang.Math.round

fun main(args: Array<String>) {
    val bill = readLine()!!.toDouble()
    val tip = bill * readLine()!!.toInt() / 100
    val tax = bill * readLine()!!.toInt() / 100
    println("The total meal cost is ${round(bill + tip + tax)} dollars.")
}
