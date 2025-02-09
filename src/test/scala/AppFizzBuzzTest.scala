import org.scalatest.funsuite.AnyFunSuite

class AppFizzBuzzTest extends AnyFunSuite {

  // Test cases for the OOP + FP implementation (AppFizzBuzz)
  test("AppFizzBuzz should return 'Fizz' for numbers divisible by 3") {
    assert(AppFizzBuzz.isFizz(1) == None)
    assert(AppFizzBuzz.isFizz(3) == Some("3 - Fizz"))
    assert(AppFizzBuzz.isFizz(6) == Some("6 - Fizz"))
  }

  test("AppFizzBuzz should return 'Buzz' for numbers divisible by 5") {
    assert(AppFizzBuzz.isBuzz(2) == None)
    assert(AppFizzBuzz.isBuzz(5) == Some("5 - Buzz"))
    assert(AppFizzBuzz.isBuzz(10) == Some("10 - Buzz"))
  }

  test(
    "AppFizzBuzz should return 'FizzBuzz' for numbers divisible by both 3 and 5"
  ) {
    assert(AppFizzBuzz.isFizzBuzz(7) == None)
    assert(AppFizzBuzz.isFizzBuzz(15) == Some("15 - FizzBuzz"))
    assert(AppFizzBuzz.isFizzBuzz(30) == Some("30 - FizzBuzz"))
  }
}
