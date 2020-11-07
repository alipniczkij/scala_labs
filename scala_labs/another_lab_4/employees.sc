// Task 29

case class Person(name: String, age: Int)
class Employee
case class Engineer(id: Person)extends Employee
case class Manager(id: Person, subordinates: List[Employee]) extends Employee

val us = List(Engineer(Person("Maxim",24)),Engineer(Person("Mark", 55)), Manager(Person("Ivan",40),
  List(new Employee)), Manager(Person("Vlad",30), List(new Employee, new Employee)))

def isManagerOver40(p: Employee):Boolean = p match {
  case Manager(Person(_, age), _) if age > 40 => true
  case _ => false }

def numOfSub(employee: Employee): Unit =
  employee match {
    case Manager(_, reports) => println(reports.length)
    case _ => println("0")}

def main(): Unit =
  us.foreach(numOfSub)

main()

// Функция main выполняет для каждого элемента списка us
// функцию numOfSub. numOfSub проверяет является ли элемент
// объектом класса Manager и, если да, выводит количество
// подчиненных этому менеджеру. Для остальных выводит 0