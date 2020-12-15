case class Queue[+T] (task:List[T]) {
  def addTask[U>:T] (x:U):List[U] = task ::: List(x)
}

val q = List(1,2,3)

println(Queue(q).addTask("2"))
println(Queue(q).addTask(true))

// List(1, 2, 3, 2)
// List(1, 2, 3, true)