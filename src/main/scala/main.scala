object Main {
  def main(args: Array[String]): Unit = {
    val n: Long = 1000
    println(s"Testing with n = $n")

    println("Runs the OOP + FP implementation")
    utils.time(AppFizzBuzz.execute(n))

    println("Runs the FP implementation")
    utils.time(AppFizzBuzzFP.compose(n))

    println("--------------------------------")
  }
}
