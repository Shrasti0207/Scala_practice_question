object Options extends App{
  def squareOfTheValue(value: Option[Int]): Option[Int] = {
    value.map(x => x*x)
  }
  println(squareOfTheValue(Some(2)))
  println(squareOfTheValue(None))

  def lengthOfTheString(inputString: Option[String]): Option[Int] = {
    inputString match {
      case Some(str) => Some(str.length)
      case None => None
    }
  }
  println(lengthOfTheString(Some("Shrasti")))

  def sumOfOptionValues(value1: Option[Int], value2: Option[Int]): Option[Int] = {
    (value1, value2) match {
      case (Some(value1), Some(value2)) => Some(value1 + value2)
      case _ => None
    }
  }
  println(sumOfOptionValues(Some(2), Some(4)))
  println(sumOfOptionValues(Some(2), None))

  def sumOfOptionList(list: List[Option[Int]]): Option[Int] = {
    val result = for {
      Some(x) <- list
    } yield x
    result.reduceOption(_ + _)
  }
  println(sumOfOptionList(List(Some(2), Some(4), None)))
}