object Tuples extends App{
  def sumOfTupleIntegers(tuple: (Int , Int)): Int = {
    tuple._1 + tuple._2
  }

  def listOfTuples(tuple: List[(String, Int)]): List[Int] = {
    tuple.map(integer => integer._2 * 2)
  }
  println(listOfTuples(List(("shrasti", 2), ("ram", 3), ("mani", 5))))

  def concatenateOfTupleStrings(tuple: (String, String)): (String , Int) = {
    val lengthOfconcatenateString = tuple._1 + " "+ tuple._2
    (lengthOfconcatenateString, lengthOfconcatenateString.length)
  }
  println(concatenateOfTupleStrings("shrasti", "gupta"))
}
