package me.cooper.rick.hackerrank.datatypes

import scala.io.StdIn

object DataTypes {

  def main(args: Array[String]) = {
    val i = 4
    val d = 4.0
    val s = "HackerRank "
    val j = StdIn.readLine().toInt
    val e = StdIn.readLine().toDouble
    val t = StdIn.readLine()
    println((i + j) + "\n" + (d + e) + "\n" + (s + t))
  }

}
