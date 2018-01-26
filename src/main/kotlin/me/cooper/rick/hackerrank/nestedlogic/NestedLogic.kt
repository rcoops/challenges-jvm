package me.cooper.rick.hackerrank.nestedlogic

import java.util.*

fun main(args: Array<String>) {
    val (returnedDay, returnedMonth, returnedYear) = readLine()!!.split(" ").map { it.toInt() }
    val (expectedDay, expectedMonth, expectedYear) = readLine()!!.split(" ").map { it.toInt() }
    println(when {
        calendar(returnedYear, returnedMonth, returnedDay) <= calendar(expectedYear, expectedMonth, expectedDay) -> 0
        returnedYear > expectedYear -> 10000
        returnedMonth > expectedMonth -> calculateFine(returnedMonth, expectedMonth, 500)
        else -> calculateFine(returnedDay, expectedDay, 15)
    })
}

private fun calendar(day: Int, month: Int, year: Int) = GregorianCalendar(day, month - 1, year)

private fun calculateFine(actual: Int, expected: Int, modifier: Int): Int = modifier * (actual - expected)