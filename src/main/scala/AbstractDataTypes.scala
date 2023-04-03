object AbstractDataTypes extends App {
  abstract class Maths{
    def perimeter(side: Int): Int
  }
  class Sqaure extends Maths{
    // does not necessary to override beacuse compliler will understand that it is extended from abstract class
    def perimeter(side: Int): Int = side*4
  }
  val square = new Sqaure
  println(square.perimeter(3))

  trait Geometry{
    def area(length: Int, breadth: Int): Int
  }
  trait trigonometry
  class Rectangle extends Maths with Geometry with trigonometry { // multiple traits are inherited by same class
    def perimeter(side: Int): Int = side*5
    def area(length: Int, breadth: Int): Int = length * breadth
  }

  val rectangle = new Rectangle
  println(rectangle.perimeter(3))
  println(rectangle.area(2,3))
}

// traits has no constructor parameters




