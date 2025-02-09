object utils {
  def time[A](block: => A): A = {
    val start = System.nanoTime()
    val result = block
    val end = System.nanoTime()
    println(s"Execution time: ${(end - start) / 1e6} ms")
    result
  }
}
