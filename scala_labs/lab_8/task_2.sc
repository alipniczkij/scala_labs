class Person(val firstname: String, val lastname: String)
  extends
    Ordered[Person] {
  def compare(b:Person)=if (this.firstname > b.firstname)
    10 else {
    if ((this.firstname == b.firstname)&&(this.lastname
      ==b.lastname)) 0 else -10
  }
}
def sort[T <: Ordered [T]] (x:List[T]):List[T] = x.sorted
var e=List(new Person("Vlad","Popov"), new
    Person("Maxim","Pop"), new Person("Ivan","P"))
for (c<-sort(e)) println(c.firstname)
// Ivan
// Maxim
// Vlad