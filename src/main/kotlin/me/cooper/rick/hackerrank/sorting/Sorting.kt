package me.cooper.rick.hackerrank.sorting

fun main(args: Array<String>) {
    val n: Int = readLine()!!.toInt()
    val a: IntArray = readLine()!!.split(' ').map { it.toInt() }.toIntArray()
    val swaps = bubbleSort(n, a)
    println("Array is sorted in $swaps swaps")
    println("First Element: ${a.first()}")
    println("Last Element: ${a.last()}")
}

fun bubbleSort(n: Int, a: IntArray): Int {
    var totalSwaps = 0
    fun swap(first: Int, second: Int) {
        a[first] = a[second].also { a[second] = a[first]}
    }
    for (i in 0 until n) {
        var numberOfSwaps = 0

        for (j in 0 until n - 1) {
            if (a[j] > a[j + 1]) {
                swap(j , j + 1)
                numberOfSwaps++
            }
        }
        if (numberOfSwaps == 0) break
        totalSwaps += numberOfSwaps
    }
    return totalSwaps
}