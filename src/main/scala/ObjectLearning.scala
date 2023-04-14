object objectsLearning extends App {
  object sum{
    def Addition(number1: Int , number2: Int): Int={
      val number=3
      number1+number2
    }
  }
  class sum{      // scala does not have class level functionality it has scala objects which has only one instance
    def Addition(number1: Int, number2: Int): Int = {
      val number = 3
      number1 + number2
    }
  }
  val sum1 = sum
  val sum2 = sum
  val sum3 = new sum
  val sum4 = new sum
  println(sum1 == sum2)
  println(sum3 == sum4)
  println(sum.Addition(2,7))

  def ntimes(f: (Int => Int), n: Int, x: Int): Int = {
    if(n <= 0) x
    else ntimes(f, n-1, f(x))
  }
  val plusOne = (x: Int) => x+1
  println(ntimes(plusOne,10,1))
}
