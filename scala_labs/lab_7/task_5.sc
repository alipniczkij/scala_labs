implicit class ReachInt(self: Int) {
  def fib: Int =
    self match {
      case 0 | 1 => 1
      case i => (i - 1).fib + (i - 2).fib
    }
  def fact: Int =
    self match {
      case 1 => 1
      case n => n * (n-1).fact
    }
}

// self может относиться только к Int

println(5.fact)