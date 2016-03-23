package com.algorithms

import scala.collection.mutable.ListBuffer

/**
 * Created by ranjithrajd on 21/2/16.
 */
object LexicalOrderClean {

  def fact(n: Int) = {
    def loop(i:Int,acc:Int=1):Int={
      if(i <= 0) acc
      else
        loop(i-1,acc * i)
    }
    loop(n)
  }

  def main(args: Array[String]) {

    val lines = io.Source.stdin.getLines()
    lines.drop(1).foreach(
      string => {
        val l = string.permutations.toArray.filter(p=> findRank(p)>findRank(string)).sorted
        //l.foreach(f=> println(f+".."+findRank(f)))
          if(l.isDefinedAt(0))println(l(0))else println("no answer")
      }
    )
  }
   /*def permudation(string: String):String ={
    val strings = string.split("")
    val ioStringRank = findRank(string)
    print(ioStringRank)
    var i = strings.length - 1
    while (i >= 0) {
      var j = strings.length - 1
      while (j > 0) {
        swap(j, j - 1)
        println(findRank(strings.mkString(""))+"-"+strings.mkString(""))
        if(ioStringRank <= findRank(strings.mkString(""))){
          return strings.mkString("")
        }
        j = j - 1
      }
      i = i - 1
    }
    def swap(i: Int, j: Int) = {
      val temp = strings(i)
      strings(i) = strings(j)
      strings(j) = temp
    }
    "no answer"
  } */
  def findSmallerInRight( str:String, low:Int, high:Int) :Int=
  {
    var countRight:Int = 0

    for (i <- low+1 to high)
      if (str(i) < str(low))
        countRight = countRight + 1
    countRight
  }
  def findRank(str:String):Int={
    val len = str.length
    var mul = fact(len);
    var rank = 1
    var countRight = 0

    for (i <- 0 until len)
    {
      mul = mul / (len - i)

      // count number of chars smaller than str[i]
      // fron str[i+1] to str[len-1]
      countRight = findSmallerInRight(str, i, len-1);
      rank = rank + countRight*mul
    }
    rank
  }
  /*def findRank1(str:String):Int ={
    var rank = 0
    var i = 0
    var multiply = fact(str.length)
    while (i < str.length - 1) {
      var j = i+1
      var count = 0
      while (j < str.length) {
        if(str(i) > str(j)){
          count = count + 1
        }
        j = j + 1
      }
      i = i + 1
      multiply = multiply / (str.length - i)
      rank = rank + count * (multiply)
      println("="+rank +","+ count+".."+multiply)
    }
    rank
  }*/
}
