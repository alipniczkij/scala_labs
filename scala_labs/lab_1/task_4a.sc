def sum(f: Int => Int, a: Int, b: Int): Int =
  if (a > b) 0 else f(a) + sum(f, a + 1, b)

def square(x: Int): Int = x * x

println(sum(square, 1, 5))

//Сумма квадратов