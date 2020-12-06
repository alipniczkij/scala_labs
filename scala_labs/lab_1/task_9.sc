class Person (a:Int)
{
  val age = a
  var count = "none"
  def titul = {
    if (age<22)
    {
      count="bac"
    }
    else
    {
      count="mag"
    }
  }
}

class Student (a:Int, c:Double) extends Person (a)
{
  override val age = a
  var science="none"
  if (c<4.5)
  {
    science="neg"
  }
  else
  {
    science="pos"
  }
}

var St1 = new Student(23, 4.6)
println(St1.science)
var St2 = new Student(21, 4.3)
St2.titul
println(St2.count)