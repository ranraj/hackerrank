package com.algorithms

import scala.collection.mutable.ArrayBuffer

/**
 * Created by ranjithrajd on 1/2/16.
 */
object Solution {

    def main(args: Array[String]) {
      val lines = io.Source.stdin.getLines()
      val nq = lines.next().split(" ")
      val n = nq(0).toInt
      val q = nq(1).toInt
      val ioInitSequence = lines.next().slice(0,n)
      val b = lines.slice(0,q).map(_.toInt)
      val initSequence = ioInitSequence.split("")
      var list = ArrayBuffer.empty[Int]
      for(i<-0 to n){
        for(j <- i+1 to n){
          val f = initSequence.slice(i,j).mkString("")
          if(f.length == 1){
            list += f.toInt
          }else if(!f.isEmpty && (f(0)!='0')) {
            list += f.toInt
          }
        }
      }
      val sortedList = list.sorted
      println(list.mkString(" "))
      println(sortedList.mkString(" "))
      println(b.mkString(" "))
      b.foreach{f=>{
        println(sortedList(f-1))
      }}
    }
}
