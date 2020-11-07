// Task 28
// Check multidimensional Array for non-zero elements using match

def arrayChecker[T] (ar: T): Any = ar match {
  case mas : Array[_] => mas.map(arrayChecker).forall(_==false)
  case x: Int if x == 0 => false
  case x: Int if x != 0 => true
  case _ => false
}

var multiArray = Array.ofDim [Int] (2,3,5)

multiArray(0)(1)(0)=2

println(arrayChecker(multiArray))

// Can't handle this