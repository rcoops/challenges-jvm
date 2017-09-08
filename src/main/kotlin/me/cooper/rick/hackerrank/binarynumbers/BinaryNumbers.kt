package me.cooper.rick.hackerrank.binarynumbers

fun main(args: Array<String>) {
    val input = readLine()!!
    var decimal = validateInput(input)
    if(decimal == -1) {
        println("Input must be a number within 1 & 1000000. Please try again.")
        System.exit(1)
    }
    val binary = ArrayList<Char>()
    while(decimal > 0) {
        binary += (decimal % 2).toChar()
        decimal /= 2
    }
    println(binary.toString())
    println(countConsecutiveOnes(binary.toString()))
}

fun countConsecutiveOnes(binary: String): Int {
    return binary.split('0').map { it.length }.max() ?: 0
}

fun validateInput(input: String): Int {
    var num: Int
    try {
        num = input.toInt()
        if(isOutsideAcceptableRange(num)) throw NumberFormatException()
    } catch (nfe: NumberFormatException) {
        num = -1
    }
    return num
}

fun isOutsideAcceptableRange(num: Int): Boolean {
    return num < 1 || num > 1000000
}
