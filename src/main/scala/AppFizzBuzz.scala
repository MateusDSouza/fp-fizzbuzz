object AppFizzBuzz extends App {

  /** Generates a list of numbers from 1 to N.
    *
    * @param N The upper limit of the range (inclusive).
    * @return A list containing numbers from 1 to N.
    */
  val mockStreamNumbers: Long => List[Long] = (N: Long) => {
    (1 to N.toInt).toList.map(_.toLong) // Convert to Long after range creation
  }

  /** Checks if a number is divisible by 3.
    *
    * @param n The number to check.
    * @return `Some("Fizz")` if the number is divisible by 3, otherwise `None`.
    */
  val isFizz: Long => Option[String] = (n: Long) => {
    if (n % 3 == 0) Some(s"${n} - Fizz") else None
  }

  /** Checks if a number is divisible by 5.
    *
    * @param n The number to check.
    * @return `Some("Buzz")` if the number is divisible by 5, otherwise `None`.
    */
  val isBuzz: Long => Option[String] = (n: Long) => {
    if (n % 5 == 0) Some(s"${n} - Buzz") else None
  }

  /** Checks if a number is divisible by both 3 and 5.
    *
    * @param n The number to check.
    * @return `Some("FizzBuzz")` if the number is divisible by both 3 and 5, otherwise `None`.
    */
  val isFizzBuzz: Long => Option[String] = (n: Long) => {
    if (n % 3 == 0 && n % 5 == 0) Some(s"${n} - FizzBuzz") else None
  }

  val execute: Long => Unit = (N: Long) => {
    mockStreamNumbers(100).foreach { n =>
      val result =
        isFizzBuzz(n).orElse(isFizz(n)).orElse(isBuzz(n)).getOrElse(n.toString)
    }
  }

}
