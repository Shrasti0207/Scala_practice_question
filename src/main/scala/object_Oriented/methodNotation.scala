package object_Oriented

object methodNotation extends App{
  val student=new Student("Shrasti","Abes college")
  student studentDetail() //infix notation
  student + 23

  val customer = new Customer("shailesh",23)
  customer.greet("shrasti")

  // interpolation
  val number=20
  val name = "shrasti"
  println(f"value of number \n: $number%s")
  println(s"value of number : $number")
  println(raw"value of number \n: $number")

}

class Student(name: String ,college: String){
  def studentDetail(): Unit={
    println(s"my name is $name and i am a student of $college")
  }
  def +(age: Int): Unit={         //all operators are methods
    println(s"I am $age years old .")
  }
}

class Customer(name: String , age: Int){
  def greet(name: String):Unit={
    println(s"my name is ${this.name}")   //access the parameter name of customer class
  }
}







