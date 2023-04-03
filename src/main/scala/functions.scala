object functions extends App{
  def expressionfunction (number1: String , number2: Int): String={
    number1+number2
  }
  println(expressionfunction("shrasti",2))

  def Factorial (number: Int):Int = {
    if(number<=1) 1
    else number * Factorial(number-1)
  }
  println("the factorial of the 5 = "+Factorial(5))

  def greeting(name: String, age: Int): String={
    "Hi my name is "+name+" and my age is " +age
  }
  println(greeting("shrasti",21))

  def fibonacci(number: Int): Int = {
    if(number==0) 0
    else if(number==1) 1
    else
      fibonacci(number-1)+fibonacci(number-2)
  }

  println(fibonacci(7))

  def isPrime(number : Int , divisor: Int=2): Boolean={
    if(number < 2)
      false
    else if(number ==2 || number ==3)
      true
    else if(number % divisor ==0)
      false
    else if((divisor * divisor > number))
      true
    else
      isPrime(number,divisor +1)

  }
  println(isPrime(5))
  println(isPrime(8))

}


