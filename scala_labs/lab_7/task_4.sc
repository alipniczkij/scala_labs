import scala.math._

def foo[T](t: T)(implicit integral: Integral[T]): Unit = {
  println(integral)
}

foo(1)