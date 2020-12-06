import System.nanoTime

implicit class ReachInt(self: Int) {
  def fib: Int =
    self match {
      case 0 | 1 => 1
      case i => (i - 1).fib + (i - 2).fib
    }
  def fact: Int =
    self match {
      case 0|1 => 1
      case n => n * (n-1).fact
    }
  def fact_for: Int = {
    var res = 1
    for (k <- 1 to self) {
      res *= k
    }
    res
  }
}

val x = 7
val t1 = nanoTime
println(x.fact)
val durmatch = (nanoTime - t1) / 1e9d
println("Через match " + durmatch)
val t2 = nanoTime
println(x.fact_for)
val durcycle = (nanoTime - t2) / 1e9d
println("Через цикл "+ durcycle)