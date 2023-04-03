import scala.io.StdIn
object CountDivisors {
  def main(args:Array[String]): Unit = {
    val inputA = StdIn.readInt()
    val inputB = StdIn.readInt()
    val inputC = StdIn.readInt()
    var count = 0
    try {
      for (x <- inputA to inputB) {
        if (x % inputC == 0)
          count = count + 1
      }
    }
      println(count)
  }
}
