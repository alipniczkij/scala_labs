import java.time.LocalTime

implicit def lTime: LocalTime =
  LocalTime.now()

def printCurrentTime(implicit lT: LocalTime): Unit =
  println(lT.toString)

printCurrentTime