class GenCell[T](init: T)
{
  private var value: T = init;
  def get: T = value;
  def set(x: T) : Unit = { value = x }
}
def swap[T](x: GenCell[T], y: GenCell[T]) : Unit =
{
  val t = x.get;
  x.set(y.get);
  y.set(t)
}
val x = new GenCell[Int](1);
val y = new GenCell[Int](2);
swap[Int](x, y)
println(x.get, y.get)

// Создаем два объекта параметризованного класса GenCell.
// Класс GenCell определяет приватное поле и геттер с
// сеттером для этого поля.
//
// Параметризованная функция swap меняет между собой
// значения приватного поля двух созданных объектов класса
// В результате получим вывод (2, 1)