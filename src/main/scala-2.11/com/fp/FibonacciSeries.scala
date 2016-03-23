package com.fp

/**
 * Created by ranjithrajd on 15/2/16.
 */
object FibonacciSeries {
  def fibonacci(x:Int):Int = {
    def loop(n:Int,acc:Int): Int ={
      if(n > acc) acc
      else
        loop(n-1,n + acc)
    }
    loop(x,-1)
  }

  def main(args: Array[String]) {
    /** This will handle the input and output**/
    println(fibonacci(readInt()))
  }
}
