package me.cooper.rick.hackerrank.dictionariesandmaps

fun main(args: Array<String>) {
    val numberOfEntries = readLine()!!.toInt()
    val friendMap = (1..numberOfEntries).map {
        val (name, number) = readLine()!!.split(" ")
        name to number
    }.toMap()

    while (true) {
        val line = readLine() ?: break
        val retrieved = friendMap.getOrElse(line) { null }
        println(if(retrieved == null) "Not Found" else "$line=$retrieved")
    }

}
