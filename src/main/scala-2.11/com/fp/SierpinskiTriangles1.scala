package com.fp

/**
 * Created by ranjithrajd on 15/2/16.
 */
object SierpinskiTriangles1 {
  def drawTriangles(n: Int) {
    //Draw the N'th iteration of the fractal as described
    // in the problem statement
    val row = 32
    val col = 63
    val inc = 3
    /*for(i<-1 until n){
      printTriangle(inc,row,col)
    }*/
    printTriangle(inc, row, col, n)
    /* printTriangle(inc,row/2,col,2)
     printTriangle(inc,row/2,col,1)*/
    //printTriangle(inc,row,col,2)
  }

  def printTopFaceTriangle(j: Int, inc: Int, column: Int) = if (j > ((column / 2) - (inc / 2)) && j < ((column / 2) + (inc / 2))) "1" else "_"

  def printDownFaceTriangle(j: Int, inc: Int, column: Int) = if (j > ((column / 2) - (inc / 2)) && j < ((column / 2) + (inc / 2))) "_" else "1"

  def topFaceTriangle(start: Int, end: Int, k: Int, inc: Int) = {
    for (j <- start until end) {
      print(printTopFaceTriangle(j, inc, end))
    }
  }

  def downFaceTriangle(start: Int, end: Int, k: Int, inc: Int) = {
    for (j <- start until end) {
      print(printDownFaceTriangle(j, inc, end))
    }
  }

  def printTriangle(increment: Int, row: Int, col: Int, k: Int): Unit = {
    val partition = row / k
    for (mainLoop <- 0 until k) {
      def loop(i: Int, inc: Int): Unit = {
        if (i < partition) {
          topFaceTriangle(0, col, k, inc)
          println
          loop(i + 1, inc + 2)
        }
      }
      loop(0, increment)
    }
  }

  def main(args: Array[String]) {
    drawTriangles(readInt())
  }
}
