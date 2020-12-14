implicit class ReachInt(self: AnyVal) {
  def fib: Int =
    self match {
      case 0 | 1 => 1
      case i => (i - 1).fib + (i - 2).fib
      case _ => -1
    }
}


println(7.fib) // 21