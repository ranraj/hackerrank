package fp.startup

/**
 * Created by ranjithrajd on 18/6/15.
 */
object TestStdin {
  def main(args: Array[String]) {
    val limit:Int=readInt();
    val l=io.Source.stdin.getLines().take(limit).map(_.toInt).toList
    displayResult(l);
  }
  def displayResult(arr:List[Int]) = println(f(arr(0).toInt,arr.drop(1)).map(_.toString).mkString("\n"))
  def f(num:Int,arr:List[Int]):List[Int] = {
    return List(1,2);
  }
}

