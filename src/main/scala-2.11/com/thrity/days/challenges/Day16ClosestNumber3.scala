package com.thrity.days.challenges

/**
 * Created by ranjithrajd on 20/1/16.
 */
object Day16ClosestNumber3 {
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
    insertSort(array)
    //println(sortedArray.mkString(" "))

    var min = Int.MaxValue

     for (i<-0 until N-1){
       val diff = Math.abs(array(i)-array(i+1))
       //println(sortedArray(i)+"-"+sortedArray(i+1)+".."+diff+".."+min)
       if(diff < min)//{
         min = diff
         //map=Map.empty
         //map += (sortedArray(i) -> sortedArray(i+1))
       /*}else if(diff == min){
         map += (sortedArray(i) -> sortedArray(i+1))
       }*/
     }
    //print(min)
    //map.foreach{a => print(a._1+" "+a._2+" ")}
    for (i<-0 until N-1) {
      if(Math.abs(array(i)-array(i+1)) == min){
        print(array(i)+" "+array(i+1)+" ")
      }
    }
  }
}
