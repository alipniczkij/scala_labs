class Cat (par:Int)
{
  val dangerous=false
  var age=par;
  def increase = {age+=1}
}

class Tiger (par:Int,par1:Boolean) extends Cat (par)
{
  override val dangerous = par1
  val colour="yellow"
}

var Tig1 =new Tiger(5,true)
Tig1.increase