object Maps extends App{
  var person: Map[String, Int] = Map("Alice" -> 25, "Bob" ->35, "Charlie" -> 35)
  person = person + ("David" -> 23)
  person -= "Alice"
  person = person.updated("Bob", 23)
  println(person("Charlie"))
  println(person)

  val mylist = List(10, 34, 23, 45, 11,45)
  val sortedList = (mylist.sorted).distinct
  println(sortedList.init.last)     //init returns the list except the last element of the list
}

