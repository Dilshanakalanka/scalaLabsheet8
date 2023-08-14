object T8q1 extends App {
    val calculateInterest: Double => Double = {
        case amount if amount <= 20000 => amount * 0.02
        case amount if amount <= 200000 => amount * 0.04
        case amount if amount <= 2000000 => amount * 0.035
        case amount => amount * 0.065
        }

        print("Enter here your deposit valu : ")
        val depositAmount = scala.io.StdIn.readDouble()
        val interestAmount = calculateInterest(depositAmount)
        println(f"The interest earned in a year is: Rs. $interestAmount%.2f")
    }
