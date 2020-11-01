package A {
  class Class1 {
    val g = 5
    def m = g * g + 1
  }
  package C {
    class Class2 {
      val t = new Class1
      val g = 10
      def m1:Unit = {g * g + t.g; println(t.g)}
    }
  }
}
package B {
  class Class3 {
    val h = 52
  }
}