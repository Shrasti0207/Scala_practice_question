// print hello world
println("hello world !")

//greatest between two numbers
if(2<3)println("2 is greater")else println("3 is greater")

// addition of two numbers
var number : Int =10
var add=30+number
println(add)

//multiplication of two numbers
var number=15.4
var multiply_num=number*2
println(multiply_num)

//find the percentage
var number1=10;
var number2=20;
var number3=50;
var percentage=(number1+number2+number3)/3;
println(percentage)

//area of the rectangle
var rectangleLength=10;
var rectangleBreadth=20;
var rectangleArea=rectangleLength*rectangleBreadth
print(rectangleArea)

// Area of triangle
class TriangleArea
{
  val base=10
  val height=10
  val areaInsideBody=1/2*(base*height)
}
val Area=new TriangleArea
Area.areaInsideBody

class TimeClass(val hours:Int,val minutes:Int)
//TODO: Verify that hours is within 0 and 23
//TODO: Verify that minutes is within 0 and 59
val Time=new TimeClass(10,10)
Time.hours
Time.minutes

class Customer(firstName: String)
val customer = new Customer("johny")


//product of Arrayelements
def ArrayProduct(arrInput:Array[Int]):Int=arrInput.product
println(s"multiplication :${ArrayProduct(Array(1,2,3,4,5))}")


val name="aman"
val age=18
println("name of the person "+name+" and age "+age)


val number1=2
val number2=6
val number3=4
if((number1>number2)&&(number1>number3)){
  println(number1+"is greatest")
}
else if(((number2>number1)&&(number2>number3))){
  println(number2+"is greatest")
}
else
  println(number3+"is greatest")

val myArray:Array[Int]=Array(20,50,30)
var sum=0
for (x <- myArray)
  sum=sum+x
println("sum of the array elements"+sum)
println("product of the Array elements :"+myArray.product)


val names: Array[String]=Array("Tom","Gauri","shrasti")
names.foreach(println)

var mylist: List[Int]=List(1,2,3,4,5);
println(mylist)
println(mylist.head)
println(mylist.tail)
println(mylist.reverse)
println(mylist.max)
mylist.foreach(println)

println("Hello")

object switchCase{
  def main(args:Array[String]): Unit = {
    val personAge=20

    age match {
      case 20 => println(age)
      case 30 => println(age)
      case 40 => println(age)
      case 50 => println(age)
      case _  => println("default")
    }
  }
}

class SayHello extends Function1[String, Unit] {
  override def apply(s: String): Unit = println(s"Hello $s")
}

val sayHello: String => Unit = (s) => { println(s"Hello $s")}

