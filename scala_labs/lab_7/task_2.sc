implicit class ReachInt(self: Int) {
  def fib: Int =
    self match {
      case 0 | 1 => 1
      case i => (i - 1).fib + (i - 2).fib
    }
}

// self может относиться только к Int

println(7.fib)