object MapFlatMapFilter extends App{
  val myList=List(1,2,3,4)
  println(myList.fold(1)(_ + _))
  println(myList.foldLeft(2)(_ - _))
  println(myList.foldRight(3)(_ * _))
  println(myList.scan(4)(_ + _))


  val listofCharacters = List('a','b','c','d')
  println(myList)
  println(myList.map(index => index * (index+1)))
  println(myList.map(_  + 1))

  def capitalizeWords(words: List[String]): List[String]={
    words.map(_.capitalize)
  }
  println(MapFlatMapFilter.capitalizeWords(List("apple","banana")))

  def appendStringToList(words: List[String], suffix: Character): List[String] ={
    words.map(index=> index+suffix)
  }
  println(MapFlatMapFilter.appendStringToList(List("apple","banana"),'c'))

  def combination(numbers: List[Character], chars: List[Character]): List[String]={
    chars.flatMap((n=>numbers.map(c=>n + "-" +c)))
  }
  println(MapFlatMapFilter.combination(List('1','2','3'),List('a','b','c')))

  def removeVowels(list: List[String]): List[String] = {
    val vowels = Set('a','e','i','o','u','A','E','I','O','U')
    list.map(s => s.filterNot(vowels))
  }
  println(removeVowels(List("Hello","Scala")))

  def sortedList(list: List[List[Int]]): List[Int] = {
    list.flatMap(x => x.sorted)
  }
  println(sortedList(List(List(2,3,1), List(5,3,7))))

  def breakString(list: List[String]): List[Char] = {
    list.flatMap(x => x.toList)
  }
  println(breakString(List("shrasti","gupta")))
}

