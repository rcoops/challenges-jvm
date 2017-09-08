package me.cooper.rick.hackerrank.introtoconditionals

fun main(args: Array<String>) {
    val num = readLine()!!.toInt()
    val print = when {
        num % 2 == 1 || num in 6..20 -> "Weird"
        num > 20 || num in 2..5 -> "Not Weird"
        else -> null
    }
    print?.printMe()
}

private fun String?.printMe() = println(this)