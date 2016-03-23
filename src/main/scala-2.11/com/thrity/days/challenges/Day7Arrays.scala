package com.thrity.days.challenges
import io.StdIn._
/**
 * Created by ranjithrajd on 8/1/16.
 */
object Day7Arrays {
  def main(args: Array[String]) {
    val n:Int = io.StdIn.readInt()
    print(readLine()
          .split(" ")
          .map(_.toInt)
          .array
          .slice(0,n)
          .reverse
          .mkString(" "))
  }
}
