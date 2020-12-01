implicit def d1(x:Int):Int = 10+x

def printCur(implicit d:Int=>Int): Unit = println(d(1))

printCur // 1