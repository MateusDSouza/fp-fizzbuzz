import org.scalatest.funsuite.AnyFunSuite

class AppFizzBuzzFPTest extends AnyFunSuite {
  // Test cases for the pure FP implementation (AppFizzBuzzFP)

  test("AppFizzBuzzFP should return 'Fizz' for numbers divisible by 3") {
    assert(AppFizzBuzzFP.fizzBuzz(3) == "3 - Fizz")
    assert(AppFizzBuzzFP.fizzBuzz(6) == "6 - Fizz")
  }

  test("AppFizzBuzzFP should return 'Buzz' for numbers divisible by 5") {
    assert(AppFizzBuzzFP.fizzBuzz(5) == "5 - Buzz")
    assert(AppFizzBuzzFP.fizzBuzz(10) == "10 - Buzz")
  }

  test(
    "AppFizzBuzzFP should return 'FizzBuzz' for numbers divisible by both 3 and 5"
  ) {
    assert(AppFizzBuzzFP.fizzBuzz(15) == "15 - FizzBuzz")
    assert(AppFizzBuzzFP.fizzBuzz(30) == "30 - FizzBuzz")
  }

  test(
    "AppFizzBuzzFP should return the number as a string for numbers not divisible by 3 or 5"
  ) {
    assert(AppFizzBuzzFP.fizzBuzz(1) == "1")
    assert(AppFizzBuzzFP.fizzBuzz(2) == "2")
  }
}
