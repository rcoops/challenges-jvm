package me.cooper.rick.hackerrank.arrayleftshift

fun main(args: Array<String>) {
    val (arraySize, leftShifts) = readLine()!!.split(' ').map(String::toInt)
    val allInts: IntArray = readLine()!!.split(' ').map(String::toInt).toIntArray()
    val array = leftShift(allInts, leftShifts)
    println(array.joinToString(" "))
}

fun leftShift(allInts: IntArray, numberOfShifts: Int): IntArray {
    val newArray = IntArray(allInts.size)

    allInts.indices.forEach {
        val adjustment = (it - (numberOfShifts % allInts.size))
        val newIndex = if(adjustment < 0) allInts.size + adjustment else adjustment
        newArray[newIndex] = allInts[it]
    }
    return newArray
}
