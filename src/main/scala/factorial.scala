object factorial extends App {
  val fact=new FactorialUsingTailRecursion()
  println(fact.factorial(5,1))
}

class FactorialUsingTailRecursion {
  def factorial(inputNumber: Int , accumulator: Int): Int = {
    if(inputNumber==0) 0
    else if(inputNumber==0) 1
    else if(inputNumber==1) accumulator
    else factorial(inputNumber-1, inputNumber * accumulator)

  }
}

