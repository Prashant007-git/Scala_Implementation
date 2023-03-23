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
  // ASSIGNMENT OPERATOR
  val g = 50
  val h = 40
  var i = 0

  i = g + h
  println("simple addition: i = g + h = " + i)
  i += g
  println("Add and assignment of i += g = " + i)
  i -= g
  println("Subtract and assignment of i -= g = " + i)
  i *= g
  println("Multiplication and assignment of i *= g = " + i)
  i /= g
  println("Division and assignment of i /= g = " + i)
  i %= g
  println("Modulus and assignment of i %= g = " + i)

  // BITWISE OPERATOR
  val j = 20
  val k = 18
  var l = 0

  l = j & k
  println("Bitwise And of j & k = " + l)
  l = j | k
  println("Bitwise Or of j | k = " + l)
  l = j ^ k
  println("Bitwise Xor of j ^ k = " + l)
}
