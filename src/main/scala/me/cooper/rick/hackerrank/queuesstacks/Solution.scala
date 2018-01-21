package me.cooper.rick.hackerrank.queuesstacks

import scala.collection.mutable
import scala.util.control.Breaks

class Solution {
  val queue: mutable.Queue[Char] = mutable.Queue[Char]()
  var stack: List[Char] = List[Char]()

  def enqueueCharacter(char: Char): Unit = queue += char

  def dequeueCharacter(): Char = queue.dequeue

  def pushCharacter(char: Char): Unit = stack = stack.::(char)

  def popCharacter(): Char = {
    val head = stack.head
    stack = stack.tail
    return head
  }

}

object Solution {
  def main(args: Array[String]) {
    // read the string s
    val s = scala.io.StdIn.readLine()
    // create the Solution class object p
    val obj = new Solution()
    val i = 0
    val len = s.length()
    //push/enqueue all the characters of string s to stack
    for (i <- 0 until len) {
      obj.pushCharacter(s.charAt(i))
      obj.enqueueCharacter(s.charAt(i))
    }

    var isPalindrome = true
    /*pop the top character from stack
      dequeue the first character from queue
      compare both the characters*/

    val loop = new Breaks
    loop.breakable {
      for (i <- 0 to len / 2) {
        if (obj.popCharacter() != obj.dequeueCharacter()) {
          isPalindrome = false
          loop.break
        }
      }
    }

    //finally print whether string s is palindrome or not
    if (isPalindrome) {
      println("The word, " + s + ", is a palindrome.")
    }
    else {
      println("The word, " + s + ", is not a palindrome.")
    }
  }
}
