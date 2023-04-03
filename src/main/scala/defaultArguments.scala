object defaultArguments extends App {
  def sumTwoNumbers(input1: Int, input2: Int = 2): Int = {
    input1 + input2
  }
  println(sumTwoNumbers(6, 5)) // output 11

  def stringNumber(inputstring: String, inputnumber: Int): String = {
    inputstring + inputnumber
  }
  println(stringNumber(inputstring = "helo", inputnumber = 23)) // naming the arguments

  val inputstring: String = "hello I am shrasti "
  println(inputstring.split(" a").toList)
}
