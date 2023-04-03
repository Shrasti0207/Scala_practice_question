object expression extends App{
    val  number=20
  println(if(number==20) "yes" else "no")
    val codeblock : Int ={
      var sum = 0
      var index = 0
      while (index <= 10) {
        sum = sum + index
        index = index + 1
      }
      sum
    }
  println("the sum of the numbers :"+codeblock)

  val somevalue = {
    2<3
  }
  println(somevalue)

  val anothervalue = {
    if(somevalue) 23 else 43
    78
  }
   println(anothervalue)
}
