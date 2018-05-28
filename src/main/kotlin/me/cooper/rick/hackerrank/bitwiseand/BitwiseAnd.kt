package me.cooper.rick.hackerrank.bitwiseand

fun main(args: Array<String>) {
    (0 until (readLine()?.toInt() ?: 0)).map {
        val (n, k) = readLine()!!.split(" ").map { it.toInt() }
        if (((k - 1).or(k)) <= n) k - 1 else k - 2
    }.forEach { println(it) }
}