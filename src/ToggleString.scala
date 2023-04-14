import scala.io.StdIn
import scala.util.Try

object ToggleString extends App{
  println("Enter the String :" )
  val inputString = StdIn.readLine()

  try{
    //when we required mutable string then we use Stringbuilder to hold the toggled string.
    val sb = new StringBuilder()

    if(inputString.isEmpty)
      throw new IllegalArgumentException("Input string must not be null or empty.")

    inputString.foreach(c => {
      
      val isDigit=c.isDigit
      if(isDigit)
        throw new ArithmeticException("Input string must not be digit.")

      if (c.isUpper) //isUpper method returns the boolean value
        sb.append(c.toLower)
      else
        sb.append(c.toUpper)

    })
    println("Toggled String :"+sb.toString())
  }
  catch {
    case e : IllegalArgumentException => println(e.getMessage)
    case e : ArithmeticException => println(e.getMessage)
  }
}
