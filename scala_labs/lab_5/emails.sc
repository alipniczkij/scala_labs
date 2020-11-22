// Task 30

object EMail{
  def unapply(str: String): Option[(String, String, String)] = {
    val parts:Array[String] = str.split("@")
    if (parts.length == 2) {
      val more_parts = parts(1).split("[.]")
      if (more_parts.length == 2) Some(parts(0), more_parts(0), more_parts(1))
      else None
    }
    else None
  }
}
var selString:String="aaa@bbb.ru"
selString match {
  case EMail(user, domain, high_domain) => println("user: " + user + "\ndomain: " + domain + "." + high_domain)
  case _ => println("не адрес")
}

// Экстрактор распаковывает поданную на вход строку
// и определяет является ли она почтовым адресом