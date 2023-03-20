object functional_combinators extends App{
  // map()
  val numbers = List(1, 2, 3, 4)
  println(numbers.map((i: Int) => i * 2))
  // reduce()
  val collection = List(1, 3, 2, 5, 4, 7, 6)
  // finding the maximum valued element
  val res = collection.reduce((x,y) => x max y)
  println(res)
  // zip()
  val l1 = List(1, 2, 3)
  val l2 = List("a", "b", "c")
  val l3 = l1.zip(l2)
  println(l3)
}
