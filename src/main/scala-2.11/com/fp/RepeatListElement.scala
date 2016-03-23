package com.fp

/**
 * Created by ranjithrajd on 14/2/16.
 */
object RepeatListElement {

  def main(args: Array[String]) {
    val lines = io.Source.stdin.getLines().takeWhile(defined(_)).map(_.toInt).toList
    displayResult(lines)
    //print (f(lines(1),lines.slice(1,lines.length)).mkString("\n"))
  }

  def f(num: Int, arr: List[Int]): List[Int] = List.tabulate(arr.length, num)((x, y) => arr(x)).flatMap(a => a)

  /*def f1(num: Int, arr: List[Int]): List[Int] = {
    val list = List.tabulate(3, 2)((x, y) => arr(x))
    list.flatMap(a => a)
  }
  */
  @inline def defined(line: String) = {
    line != null && line.nonEmpty
  }

  def displayResult(arr: List[Int]) = println(f(arr(0).toInt, arr.drop(1)).map(_.toString).mkString("\n"))
}

/**
 * Sample input
 * 3
 * 1
 * 2
 * 3
 *
 * Sample Output
 * 1
 * 1
 * 1
 * 2
 * 2
 * 2
 * 3
 * 3
 * 3
 *
 */

