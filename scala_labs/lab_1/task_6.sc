class Rational(n: Int, d: Int) {
  val numer: Int = n
  val denom: Int = d
  def this(n: Int) = this(n, 1)
}
var r1 = new Rational(2)
var r2 = new Rational(4, 5)

//В первом случае выполнится дополнительный конструктор this, так как
//передается только одно значение в класс. Во втором случае выполнится
//только основной конструктор.