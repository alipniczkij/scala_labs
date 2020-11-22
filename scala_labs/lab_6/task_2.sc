var exIterator = Iterator(10, 2, 45, -63, 111)


println(exIterator.next())
println(exIterator.count(_>0))

println(exIterator.isEmpty) // Empty after previous operation
