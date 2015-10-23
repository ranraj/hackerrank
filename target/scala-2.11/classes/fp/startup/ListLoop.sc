def main(args: Array[String]) {
  val arr=io.Source.stdin.getLines().map(_)

  //displayResult(arr)
}
def displayResult(arr:List[Int]) = println(f(arr(0).toInt,arr.drop(1)).map(_.toString).mkString("\n"))
def f(num:Int,arr:List[Int]):List[Int] = List(1,2,4)