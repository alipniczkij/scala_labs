// Task 27
// Define summary of List elements using match

def listSum(l: List[Int]): Int = l match {
  case x :: tail => x + listSum(tail)
  case Nil => 0
}

var random_list:List[Int] = List(1, 2, 3, 4, 5)

print(listSum(random_list))