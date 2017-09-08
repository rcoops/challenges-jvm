package me.cooper.rick.hackerrank.twodimensionalarrays

fun main(args: Array<String>) {
    val MATRIX_SIZE = 6
    val matrix: Array<IntArray> = (1..MATRIX_SIZE).map {
        readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    }.toTypedArray()

    val maxSum = (0 until 4).fold(-2147483648, { max, x ->
        val current = (0 until 4).fold(-2147483648, { rowMax, y ->
            val current = getHourGlassSum(matrix, x, y)
            if (current > rowMax) current else rowMax
        })
        if (current > max) current else max
    })
    println(maxSum)
}

fun getHourGlassSum(matrix: Array<IntArray>, x: Int, y: Int): Int {
    return matrix[x][y] + matrix[x][y + 1] + matrix[x][y + 2] +
            matrix[x + 1][y + 1] +
            matrix[x + 2][y] + matrix[x + 2][y + 1] + matrix[x + 2][y + 2]
}
