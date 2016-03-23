package com.thrity.days.challenges

import java.util.Scanner;

/**
  * Created by ranjithrajd on 11/1/16.
  */
object Day8PhoneBookMap1 {

   def main(args: Array[String]) {
     val N = io.StdIn.readInt()
     var map = Map.empty[String, Int]
     for (i <- 0 until N) {
       map += io.StdIn.readLine() -> io.StdIn.readInt()
     }
     val in = new Scanner(System.in);
     in.nextLine();
     while(in.hasNext())
     {
       val s=in.nextLine();
       map.get(s).getOrElse("Not Fount")
     }
     /*val ln = io.Source.stdin.getLines
     ln.foreach(f => {
       map.get(f).getOrElse("Not Fount")
     })*/


      /* var ln = io.Source.stdin.getLines()
       println(map.get(ln).getOrElse("Not Fount"))*/

     /*3
     sam
     99912222
     tom
     11122222
     harry
     12299933
     sam
     edward
     harry*/
   }
 }
