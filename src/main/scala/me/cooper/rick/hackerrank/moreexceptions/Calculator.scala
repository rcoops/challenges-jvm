package me.cooper.rick.hackerrank.moreexceptions

import java.security.InvalidParameterException

import scala.math.pow

class Calculator {

  @throws[InvalidParameterException]("if either parameter is negative")
  def power(n: Int, p: Int): Int = {
    if(n < 0 || p < 0) throw new InvalidParameterException("n and p should be non-negative")

    pow(n, p).toInt
  }

}

object Solution {

  def main(args: Array[String]) {
    val myCalculator = new Calculator()
    val T: Int = scala.io.StdIn.readLine().toInt

    for (_ <- 1 to T) {
      val Array(n, p): Array[Int] = scala.io.StdIn.readLine().split(" ").map(_.toInt)
      try {
        val ans: Int = myCalculator.power(n, p)
        println(ans)
      }
      catch {
        case e: Exception => println(e.getMessage)
      }
    }
  }

}
