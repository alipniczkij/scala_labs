import java.time._

implicit def lTime: ZonedDateTime = {
  ZonedDateTime.now.withZoneSameInstant(ZoneId.of("UTC"))
}

def printCurrentTime(implicit lT: ZonedDateTime): Unit =
  println(lT.toString)

printCurrentTime