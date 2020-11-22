"123abc".forall((0 to 9).contains(_))

List[Int] (1, 2, 3, 4, 5).filter(_>0).map(x => x*x)

List[Int] (1, 2, 15, 4, 5).partition(_ > 10)

!Array[Int] (-123, 421, 44, 86).forall(_.abs <= 100)

