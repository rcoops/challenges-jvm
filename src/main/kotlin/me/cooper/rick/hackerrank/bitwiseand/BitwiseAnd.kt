package me.cooper.rick.hackerrank.bitwiseand

fun main(args: Array<String>) {
    val noOfTestCases = readLine()!!.toInt()
    val results = IntArray(noOfTestCases)
    val ns = arrayOf(5, 8, 2)
    val ks = arrayOf(2, 5, 2)
    for (i in 0 until noOfTestCases) {
        val (n, k) = readLine()!!.split(" ").map { it.toInt() }
//        results[i] = bitwiseAnd(n, k)
        results[i] = bitwiseAnd(ns[i], ks[i])
    }
    results.forEach { println(it) }
}

fun bitwiseAnd(n: Int, k: Int): Int {
    val ands = (2..n).map { it.and(it - 1) }
//    ands.forEach { println(it) }
    return ands.filter { it < k }.max() ?: 0
//    for (x in n..2) {
//        val a = x.and(x - 1)
//        result = if (a in (result - 1) until k) a else result
//    }
//    return result
//    while (a > 1) {
//        print ("a = $a, result = $result, bitwise = ")
//        a--
//        val b = a.and(a - 1)
//        print("$b, result = ")
//        result = if (b in (result - 1) until k) b else result
//        println(result)
//    }
//    println("final result = $result")
//    return result
}

fun <T1, T2> Collection<T1>.combine(other: Iterable<T2>): List<Pair<T1, T2>> {
    return combine(other, {thisItem: T1, otherItem: T2 -> Pair(thisItem, otherItem) })
}

fun <T1, T2, R> Collection<T1>.combine(other: Iterable<T2>, transformer: (thisItem: T1, otherItem:T2) -> R): List<R> {
    return this.flatMap { thisItem -> other.map { otherItem -> transformer(thisItem, otherItem) }}
}