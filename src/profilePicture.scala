import scala.io.StdIn

object profilePicture extends App {
  println("enter the length of photo :")
  val photolength = StdIn.readInt()

  println("enter the width of photo:")
  val photowidth = StdIn.readInt()

  println("Enter the Height of photo:")
  val photoheight = StdIn.readInt()

try{
  if(photolength <= 0 || photowidth <= 0 || photoheight <= 0)
    throw new ArithmeticException("Input sides must not be negative or zero .")

  if (photolength > photowidth && photolength > photoheight)
    println("upload another one ")

  else if (photolength == photowidth && photolength == photoheight)
    println("accepted")

  else
    println("crop it")
}

catch {
  case e: ArithmeticException => println(e.getMessage)
}
}
