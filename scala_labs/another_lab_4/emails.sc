// Task 30

object EMail{
  def unapply(str: String): Option[(String, String)] = {
    val parts:Array[String] = str.split("@")
    if (parts.length == 2) Some(parts(0), parts(1))
    else None
  }
}
var selString:String="aaa@bbb.ru"
selString match {
  case EMail(user, domain) => println("user: " + user + "\ndomain: " + domain)
  case _ => println("не адрес")
}

// Экстрактор распаковывает поданную на вход строку
// и определяет является ли она почтовым адресом