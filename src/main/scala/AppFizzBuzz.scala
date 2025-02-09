object AppFizzBuzz {

  val mockStreamNumbers: Long => List[Long] = (N: Long) => {
    (1 to N.toInt).toList.map(_.toLong) // Convert to Long after range creation
  }

  val isFizz: Long => Option[String] = (n: Long) => {
    if (n % 3 == 0) Some(s"${n} - Fizz") else None
  }

  val isBuzz: Long => Option[String] = (n: Long) => {
    if (n % 5 == 0) Some(s"${n} - Buzz") else None
  }

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
