object recursion extends App{
   def concatenateString(inputString: String, concatenateTime: Int):  String={
     def concatenateHelper(inputString: String, concatenateTime: Int, accumulator: String): String={
       if(concatenateTime==0)
         accumulator
       else
         concatenateHelper(inputString,concatenateTime-1,accumulator+1)
     }
     concatenateHelper(inputString,concatenateTime," ")
   }
  val result = concatenateString("hello",3)
  println(result)

}
