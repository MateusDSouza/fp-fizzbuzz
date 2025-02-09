object AppFizzBuzzFP {

  val mockStreamNumbers: Long => List[Long] = (N: Long) => {
    (1 to N.toInt).toList.map(_.toLong)
  }

  val fizzBuzz: Long => String = {
    case x if x % 3 == 0 && x % 5 == 0 => s"${x} - FizzBuzz"
    case x if x % 3 == 0               => s"${x} - Fizz"
    case x if x % 5 == 0               => s"${x} - Buzz"
    case n                             => n.toString
  }

  val compose: Long => List[String] = (N: Long) => {
    mockStreamNumbers(N).map(fizzBuzz)
  }

}
