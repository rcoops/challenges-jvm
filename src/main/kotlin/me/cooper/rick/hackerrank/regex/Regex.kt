package me.cooper.rick.hackerrank.regex

class Record(val name: String, val email: String)

fun main(args: Array<String>) {
    val numberOfPeople = readLine()!!.toInt()
    (1..numberOfPeople).map {
        val (name, email) = readLine()!!.split(" ")
        Record(name, email)
    }.filter { it.email.endsWith("@gmail.com")}
            .sortedBy { it.name }
            .forEach { println(it.name) }
}