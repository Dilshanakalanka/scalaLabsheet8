object T8q2  extends App{
  val checkNumber: Int => String = {
    case num if num < 0 => "This is a Negative number"
    case num if num == 0 => "This is Zero"
    case num if num % 2 == 0 => "This is an Even number"
    case num => "This is an Odd number"
  }

  print("Enter a integer here : ")
  val input = scala.io.StdIn.readInt()
  val result = checkNumber(input)
  println(result)
}

