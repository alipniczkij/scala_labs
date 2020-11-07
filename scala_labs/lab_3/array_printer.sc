def printer[T] (x : T) : String = x match {
  case mas: Array[_] => mas.map(printer).mkString("[", " ", "]")
  case _ => x.toString
}

//def array_printer (x : Ordered[Any]) : Unit = {
//  if (x.isInstanceOf[Array[_]]) {
//    for (i <- 1 to x.size) {
//      if (x(i).isInstanceOf[Array[_]]) {
//        array_printer(x(i))
//      } else{
//        print(x(i) + " ")
//      }
//    }
//  }
//}

var a=Array.ofDim [Int] (2,3,5)
a(0)(1)(0)=2

print(printer(a(0)))

//array_printer(Array(Array(0, 1), Array(2, 3)))