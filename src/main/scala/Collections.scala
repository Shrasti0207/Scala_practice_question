object collections extends App {
  val myMap: Map[Int, String] = Map((1, "gauri"), (2, "shrasti")).withDefaultValue("")
  println(myMap.contains(5))

  val list: List[Option[String]] = List(Some("Shrasti"), None, Some("gauri"))
  println(listOptionStringtoListString(list))

  val list1: Option[List[String]] = Some(List("gauri", "muskan"))

  def opt: Option[String] = Some("Shrasti")

  println(opt.isEmpty)

  def listOptionStringtoListString(name: List[Option[String]]): List[String] = {
    name.flatMap(
      mayBename => mayBename.map {
        name => name.toUpperCase()
      }
    )
  }

  def optiontoOption(name: Option[String]): Option[String] = {
    name.map{
      name=>name.toUpperCase()
    }
  }
  def addition(list1: List[Int]): Int = {
    if(list1.length == 0) 0
    else list1.head + addition((list1.tail))
  }
  println(addition(List(2,3,4,5)))
}
