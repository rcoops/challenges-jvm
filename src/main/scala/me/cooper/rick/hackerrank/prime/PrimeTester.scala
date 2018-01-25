package me.cooper.rick.hackerrank.prime

import scala.collection.mutable
import scala.io.StdIn.readLine

object PrimeTester {

  def isPrime(potentialPrime: Int): Boolean = {
    potentialPrime == 2 ||
      potentialPrime != 1 &&
        potentialPrime % 2 != 0 &&
        !(3 to math.sqrt(potentialPrime).toInt).exists(potentialPrime % _ == 0)
  }

}

object Solution {

  def main(args: Array[String]) {
    val T: Int = readLine().toInt
    var potentials: mutable.MutableList[Int] = mutable.MutableList[Int]()
    for (_ <- 1 to T) potentials += readLine().toInt
    for (p <- potentials) println(if (PrimeTester.isPrime(p)) "Prime" else "Not prime")
  }

}
