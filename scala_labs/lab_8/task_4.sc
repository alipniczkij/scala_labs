case class randomClass (var field: String) extends Ordered[randomClass] {
  def compare(q:randomClass): Int = if (this.field > q.field) 1 else
    {if (this.field == q.field) 0 else -1}
}
def sort[T <: Ordered[T]] (x:Seq[T]):Seq[T] = x.sorted

val t1 = List(randomClass("kbonie"), randomClass("nvshr"), randomClass("pkorw"), randomClass("afsg"))

for (c<-sort(t1)) print(c.field + " ")
// afsg kbonie nvshr pkorw