object scala_collections extends App{
  // LIST
  val numbers = List(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
  println(numbers(5))
  // numbers[6] = 56 IMMUTABLE SO CAN'T BE UPDATED
  // SET
  val num1 = Set(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
  println(num1) // prints (5,1,2,3,4)
  // MAP
  val myMap = Map("apple" -> 2, "banana" -> 5, "orange" -> 1)
  println(myMap.toSeq(1))
  println(myMap("apple"))
  println(myMap)
}
