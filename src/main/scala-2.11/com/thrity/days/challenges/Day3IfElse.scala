package com.thrity.days.challenges

/**
 * Created by ranjithrajd on 5/1/16.
 */
object Day3IfElse {
  def main(args: Array[String]) {
    val N = io.StdIn.readInt()
    if (N % 2 != 0) {
      // Odd
      println("Weird")
    } else {
      if (N >= 2 && N <= 5) {
        println("Not Weird")
      }
      if (N >= 6 && N <= 20) {
          println("Weird")
      }
      if(N > 20){
          println("Not Weird")
      }
    }
  }
}
