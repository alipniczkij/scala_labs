class Rad {
  private val numer: Int = 1
  private var denom: Int =0
  def num = numer
  private def den = denom
  private def den_=(Newv:Int) {if (Newv >=3) denom=Newv}
  def con():Unit = {den=2; println (den)}
}
var user = new Rad
user.num
user.con

//Создаем экземпляр класса Rad в переменной user. Класс рад представляет из
//  себя множество переменных и функций.
//  Переменная numer –– неизменяемая и приватная, к ней нельзя обратиться
//  через экземпляр класса и нельзя изменить. Но объявлен публичный метод
//  num, с помощью который является геттером для переменной numer.
//Переменная denom –– изменяемая приватная переменная, к ней нельзя
//обратиться через экземпляр класса. Здесь же объявлены приватные сеттер и
//  геттер для переменной denom. Причем сеттер den_ меняет значение denom
//  только в случае, если новое задаваемое значение больше либо равно 3
//user.num возвращает значение, которое лежит в приватном атрибуте numer
//  нашего экземпляра класса. Конкретно –– 1 user.con вызывает метод класса
//  con(), который присваивает переменной den значение 2 и выводит на экран
//результат выполнения приватной функции den –– значение переменной
//  denom 0