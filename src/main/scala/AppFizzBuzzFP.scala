object AppFizzBuzzFP extends App {

  /** Generates a list of numbers from 1 to N.
    *
    * @param N The upper limit of the range (inclusive).
    * @return A list containing numbers from 1 to N.
    */
  val mockStreamNumbers: Long => List[Long] = (N: Long) => {
    (1 to N.toInt).toList.map(_.toLong) // Convert to Long after range creation
  }

  /** Determines the FizzBuzz result for a given number using pattern matching.
    *
    * @param n The number to evaluate.
    * @return "Fizz" if divisible by 3, "Buzz" if divisible by 5,
    *         "FizzBuzz" if divisible by both 3 and 5, otherwise the number as a string.
    */
  val fizzBuzz: Long => String = {
    case x if x % 3 == 0 && x % 5 == 0 => s"${x} - FizzBuzz"
    case x if x % 3 == 0               => s"${x} - Fizz"
    case x if x % 5 == 0               => s"${x} - Buzz"
    case n                             => n.toString
  }

  /** Composes the FizzBuzz logic for a given range of numbers.
    *
    * This function generates a list of numbers from 1 to N and applies the FizzBuzz transformation
    * to each number.
    *
    * @param N The upper limit of the range (inclusive).
    * @return A list of FizzBuzz results as strings.
    */
  val compose: Long => List[String] = (N: Long) => {
    mockStreamNumbers(N).map(fizzBuzz)
  }

}
