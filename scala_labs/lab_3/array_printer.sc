def printer[T] (x : T) : String = x match {
  case mas: Array[_] => mas.map(printer).mkString("[", " ", "]")
  case _ => x.toString
}

var a=Array.ofDim [Int] (2,3,5)
a(0)(1)(0)=2

print(printer(a(0)))