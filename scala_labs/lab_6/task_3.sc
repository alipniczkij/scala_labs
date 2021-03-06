println((1 to 10).map(println).take(5).toList)
// Выводит числа от 1 до 10 и в конце println
// выводит список из 5 пустых кортежей
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// List((), (), (), (), ())

println((1 to 10).iterator.map(println).take(5).toList)
// Выводятся числа от 1 до 5 и в конце println выводит список
// состоящий из 5 пустых кортежей
// 1
// 2
// 3
// 4
// 5
// List((), (), (), (), ())

(1 to 10).iterator.map(println)
// Возвращается итератор с значениями внутри:
// 1
// ()2
// ()3
// ()4
// ()5
// ()6
// ()7
// ()8
// ()9
// ()10
// ()
//for (el <- iter) {print(el)}