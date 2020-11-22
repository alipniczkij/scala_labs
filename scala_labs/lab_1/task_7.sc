class Account (n:Double) {
  var num1 =1
  def M = num1+n
}
object Account {
  var number =5
  private def apply(Ib:Double)= new Account (Ib)
}
val Acc1 = Account(20.0)

println (Acc1.num1 + " " + Acc1.M + " " + Account.number)

//Класс Аккаунт имеет изменяемую переменную
//num1, равную 1 и
//  объявленный метод M, который возвращает сумму num1 и переданного
//  классу значения n.
//  Объект-спутник object Account позволяет не использовать ключевое слово
//new, при создании экземпляра класса
//  Account, потому что в нем
//  переопределен метод apply. В результате выведется «1 21 5»