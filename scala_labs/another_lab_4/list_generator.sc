// Task 26
// Create list from a random list by deleting first and last elements. Use match

var random_list:List[Any] = List(1, 2, 3, 4, 5)


def createList(l: List[Any]) = l match {
  case _ +: middle :+ _ => middle
  case _ => None
}

println(createList(random_list))