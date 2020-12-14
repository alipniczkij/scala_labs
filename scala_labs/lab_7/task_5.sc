import java.lang.System.nanoTime

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

val x = 30
val t1 = nanoTime
println(x.fact)
val durmatch = (nanoTime - t1) / 1e9d
println("Match " + durmatch)
val t2 = nanoTime
println(x.fact_for)
val durcycle = (nanoTime - t2) / 1e9d
println("Цикл "+ durcycle)

// Факториал 7. match 0.515586877, цикл 0.301660081
// Факториал 10. match 0.330665022, цикл 0.30896035
// Факториал 15. match 0.240712112, цикл 0.245011413
// Факториал 20. match 0.484792189, цикл 0.243290255
// Факториал 30. match 0.355992839, цикл 0.223339264