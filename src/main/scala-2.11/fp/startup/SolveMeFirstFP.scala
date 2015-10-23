package fp.startup

/**
 * Created by ranjithrajd on 8/6/15.
 */
object SolveMeFirstFP {
  def main(args: Array[String]) {
    var l=List.empty[Int]
    try {
      var a = io.Source.stdin.getLines()
      while (a.hasNext) {
        var b = a.next()
        l.:+(1)
      } }catch {
      case e: Exception =>
    }
    println(l)
    def getInt: PartialFunction[String,Int]={
      case x => x.toInt
    }
//    displayResult(io.Source.stdin.getLines().toList.)

  }
  def displayResult(arr:List[Int]) = println(f(arr(0).toInt,arr.drop(1)).map(_.toString).mkString("\n"))
  def f(num:Int,arr:List[Int]):List[Int] = {
    return List(1,2);
  }

}
