class Queue[+T] (task:List[T]) {
  def head = task.head
}

var t = new Queue[Int](List(1,2,3))
var l = new Queue[Any](List(1,"2", true))