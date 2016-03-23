package com.fp

/**
  * Created by ranjithrajd on 15/2/16.
  */
object ListFilterByOddValue {

     def main(args: Array[String]) {
       def f(delim:Int,arr:List[Int]):List[Int] ={
         arr.filter(delim >)
       }
       @inline def defined(line: String) = {
         line != null && line.nonEmpty
       }
       val lines = io.Source.stdin.getLines().takeWhile(defined(_)).toList
       println(f(lines(0).toInt,lines.map(_.trim).map(_.toInt)).map(_.toString).mkString("\n"))
     }
 }
