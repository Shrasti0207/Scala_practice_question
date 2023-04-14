object switchCase {
  def main(args:Array[String]): Unit = {
    val personAge = 100

    personAge match{
      case 10 => println(personAge)
      case 20 => println(personAge)
      case _  => println("default")
    }

    val checkmutiplevalue=8
    checkmutiplevalue match{
      case 1|3|5|7|9 => println(checkmutiplevalue+" is odd")
      case 2|4|6|8|10 => println(checkmutiplevalue+" is even")
    }

    val checkWeekDay="Tuesday"
    checkWeekDay match{

      case "Monday" =>println(checkWeekDay +" is the first day of week");
      case "Tuesday" =>println(checkWeekDay +" is the second day of week");
      case "Wednesday" =>println(checkWeekDay +" is the third day of week");
      case "Thursday" =>println(checkWeekDay +" is the fourth day of week");
      case "Friday" =>println(checkWeekDay +" is the fifth day of week");
      case "Saturday" =>println(checkWeekDay +" is the sixth day of week");
      case "Sunday" =>println(checkWeekDay +" is the seventh day of week");
    }

  }

}
