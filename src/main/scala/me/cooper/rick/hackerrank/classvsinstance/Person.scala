package me.cooper.rick.hackerrank.classvsinstance

case class Person(var age: Int = 0) {

  if (age < 0) {
    println("Age is not valid, setting age to 0.")
    age = 0
  }

  def amIOld(): Unit = {
    println {
      if (age < 13) "You are young."
      else if (age > 12 && age < 18) "You are a teenager."
      else "You are old."
    }
  }

  def yearPasses(): Unit = age += 1

}

object Solution {

  def main(args: Array[String]) {
    val T = scala.io.StdIn.readInt()
    for (_ <- 1 to T) {
      val age = scala.io.StdIn.readInt()
      val person = Person(age)
      person.amIOld()
      for (_ <- 1 to 3) person.yearPasses()
      person.amIOld()
      println()
    }
  }

}