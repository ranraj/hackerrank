package com.thrity.days.challenges

/**
 * Created by ranjithrajd on 20/1/16.
 */
object Day16ClosestNumber2 {
  def insertSort(list:Array[Int]) = {
    var j = 1
    while(j < list.length){
      val key = list(j)
      var i = j-1
      while(i >= 0 && list(i) > key){
        list(i+1) = list(i)
        i = i - 1
      }
      list(i+1)=key
      j = j + 1
    }
    list
  }
  def main(args: Array[String]) {
    val N = io.StdIn.readInt()
    val array = io.StdIn.readLine().split(" ").map(_.toInt).array
    val sortedArray = insertSort(array)
    println(sortedArray.mkString(" "))

    val min = Int.MaxValue
    var map=Map.empty[Int,Int]

     for (i<-1 until N){
       val diff = sortedArray(0)-sortedArray(i)
       if(diff < min){
         min == diff
       }
     }
   print(min)
    //map.foreach{a => print(a._1+" "+a._2+" ")}
  }
}
