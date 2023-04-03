object stringInteger {
  def main(args: Array[String]): Unit = {
    val inputString = "shrasti02";
    var flag = 0
    for (x <- inputString) {
      if (x == '0') flag = 1 else if (x == '1') flag = 1 else if (x == '2') flag = 1 else if (x == '3') flag = 1 else if (x == '4') flag = 1
      else if (x == '5') flag = 1 else if (x == '6') flag = 1 else if (x == '7') flag = 1 else if (x == '8') flag = 1
      else if (x == '9') flag = 1
      else flag = 0
    }
    if (flag == 0)
      println("False")
    else
      println("true")
  }
}
