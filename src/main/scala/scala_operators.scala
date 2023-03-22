object scala_operators extends App {
  // ARITHMETIC OPERATORS
  // +, -, *, /, %
  val a = 76
  val b = 5
  println("addition of a and b is: "+(a+b))
  println("subtraction of b from a is: "+(a-b))
  println("multiplication of a and b is:"+(a*b))
  println("a divided by b is: "+(a/b))
  println("a modulus b is: "+(a%b))
  println()

  // RELATIONAL OPERATOR
  // ==, >=, <=, !=, <, >
  val c = 50
  val d = 30
  println("c is equal to d : "+(c == d))
  println("c is not equal to d : "+(c != d))
  println("c is greater than d : "+(c > d))
  println("c is less than d : "+(c < d))
  println("c is greater than or equal to d : "+(c >= d))
  println("c is less than or equal to d : "+(c <= d))

  // LOGICAL OPERATOR
  // ||, &&, !
  val e = true
  val f = false
  println("logical and operator:  "+(e&&f))
  println("logical or operator:   "+(e||f))
  println("logical not operator:  "+(e&&(!f)))

}
