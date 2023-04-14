object CaseClass extends App{
  val person1=new Person("Shrasti","Gupta",21)
  val person2=new Person("Shrasti","Gupta",21)
  //  println(person1.firstName)
  println(person1==person2)
  val person3=person1.copy(age=34)
  println(person3.age)
}

case class Person(firstName: String ,lastName: String, age: Int){
  def fullname: String=(firstName+" "+ lastName)
}


