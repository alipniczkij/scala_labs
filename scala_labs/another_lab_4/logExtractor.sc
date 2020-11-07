// Task 31

object Log{
  def unapply(str: String): Option[(String, String, String, String)] = {
    val parts:Array[String] = str.split(";")
    if (parts.length == 4) Some("Дата: " + parts(0), " Время: " + parts(1), " Тип операции: " + parts(2), " Субъект: " + parts(3))
    else None
  }
}

var logString:String = "25 Января;15:00;Запуск;Приложение"

logString match {
  case Log(log) => println(log)
  case _ => None
}