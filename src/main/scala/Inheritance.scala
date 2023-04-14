object Inheritance extends App{
  // single class inheritance
  class Dog{
    protected def mood  = println("hello")
  }
  class Cat extends Dog{    // we can call the protected method only inside the subclass cannot call outside the class
    def moody= {
      mood
      println("hello dog")
    }
  }
  class Rat extends Dog{    //override
    override def mood = println("hello dog")
  }
  val cat = new Cat
  cat.moody
  val rat = new Rat
  rat.mood

  class Person{
    def detail(firstName: String, lastName: String): Unit = {
      println(firstName + " " + lastName)
    }
    // overloading
    def detail(age: Int)={
      println(age)
    }
  }
  val person = new Person
  person.detail("Shrasti", "Gupta")
  person.detail(21)


  val list = List(2,3,4,5,6,7)
  def head(list: List[Int]): Int = list.headOption.getOrElse(0)
  def tail(list: List[Int]): List[Int] = list.tail
  def isEmpty(list: List[Int]): Boolean = list.isEmpty
  def add(element: Int): List[Int] = list.map(x => x + element)

  println(head(list))
  println(tail(list))
  println(isEmpty(list))
  println(add(2))
}
