implicit def d:Int => Int = 10+_

def printCur(implicit d:Int=>Int): Unit = println(d(1))

printCur // 1