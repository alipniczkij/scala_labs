def printer[T] (x : T) : String = x match {
  case mas: Array[_] => mas.map(printer).mkString("[", " ", "]")
  case _ => x.toString
}

def array_printer (x : Seq[_]): Unit = { // Not working
  for (el <- x) {
    if (el.isInstanceOf[Seq[_]]) {
      array_printer(el.asInstanceOf[Seq[_]])
    } else print(el.toString + " ")
  }
  println("")
}

var a=Array.ofDim [Int] (2,3,5)
a(0)(1)(0)=2

print(printer(a(0)))

array_printer(a)