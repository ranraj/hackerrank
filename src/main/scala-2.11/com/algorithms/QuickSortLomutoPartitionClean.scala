package com.algorithms

/**
 * Created by ranjithrajd on 20/2/16.
 */
object QuickSortLomutoPartitionClean {

  def sort(low: Int, high: Int, ints: Array[Int]): Array[Int] = {
    var lowLimit = low
    var highLimit = low
    //println("L = "+ low+",H ="+high)
     //taking pivot as last element
    if (high - low >= 1) {
      val pivotValue = ints(high)
      for (i <- low to high) {
        if (ints(i) < pivotValue) {
          //Grouping by the lower values of pivot
          if (highLimit >= 1) {
            exchange(lowLimit, i, ints)
          }
          lowLimit = lowLimit + 1
        }
        highLimit = highLimit + 1

        if (i == high) {
          //do swap
          //println(high+".."+lowLimit)
          exchange(lowLimit, high, ints)
        }
      }
      println(ints.mkString(" "))
      //left side array
      //println(low+".."+lowLimit)
      sort(low, lowLimit-1, ints)
      //println((highLimit - lowLimit)+".."+(highLimit-1))
      //right side array
      sort(lowLimit+1, highLimit-1, ints)
    }
    ints
  }

  def main(args: Array[String]) {
    val n = io.StdIn.readInt()
    val arr = io.StdIn.readLine().split(" ").take(n).map(_.toInt).array
    sort(0, n-1, arr)
    //print(arr.mkString(" "))
  }

  def exchange(i: Int, j: Int, ints: Array[Int]) = {
    val temp = ints(i)
    ints(i) = ints(j)
    ints(j) = temp
  }
}

/**
 * When split array low , high should be calculated with previous value while calling recurisve
 */

/**
8
8 9 1 2 6 10 4 3

1 2 3 9 6 10 4 8
1 2 3 9 6 10 4 8
1 2 3 6 4 8 9 10
1 2 3 4 6 8 9 10
1 2 3 4 6 8 9 10

7
1 3 9 8 2 7 5

1 3 2 5 9 7 8
1 2 3 5 9 7 8
1 2 3 5 7 8 9

9
9 8 6 7 3 5 4 1 2

1 2 6 7 3 5 4 9 8
1 2 6 7 3 5 4 8 9
1 2 3 4 6 5 7 8 9
1 2 3 4 6 5 7 8 9
1 2 3 4 5 6 7 8 9

8
35 12 31 30 10 20 22 17
12 10 17 30 35 20 22 31
  */
