package com.algorithms

import scala.collection.mutable.ArrayBuffer

/**
  * Created by ranjithrajd on 1/2/16.
  */
object QuickSort2 {
   def main(args: Array[String]) {
     val lines = io.Source.stdin.getLines().slice(0,2)
     val N:Int = lines.next().toInt
     val array = lines.next().split(" ").map(_.toInt).slice(0,N).array

     val pivotalPoint = array(0)
     val left=  ArrayBuffer.empty[Int]
     val right = ArrayBuffer.empty[Int]

     for(i<-0 until N){
       if(array(i) < pivotalPoint){
         left += array(i)
       }
       if(array(i) >= pivotalPoint){
         right += array(i)
       }
     }
     print((left ++ right).mkString(" "))
   }
 }
