object AnonymousFunction extends App{
  val inputNumber1: Int => Int = (x: Int) => x * 2
  println("multiply by 2 of 3 : "+inputNumber1(3));

  val inputNumber2: Int => Int = (x: Int) => x * 3
  println("multiply by 3 of 3 : "+inputNumber2(3));

  val inputNumber3: Int => Int = (x: Int) => x * 4
  println("multiply by 4 of 3 : "+inputNumber3(3));

  val number: (Int, Int) => String = (firstnum:Int, secondnum:Int) => firstnum * secondnum + "abc"
  println(number(2,2))
}
