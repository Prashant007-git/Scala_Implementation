object functional_programming extends App{

  // FUNCTIONS
  def Sum(a:Int,b:Int):Int = {
    a+b
  }

  val c = Sum(22,56)
  println(s"the value of c is: $c")

  // PATTERN MATCHING
  val check = 3
  check match{
    case 1 => println("value is 1")
    case 2 => println("value is 2")
    case 3 => println("value is 3")
    case _ => println("value is not 1 2 or 3")
  }

  // FOR LOOP
  val ar = Array(1,4,63,2,55,34)
  for(i <- ar){
    println(i + " is an element of array ar")
  }

  // WHILE LOOP
  var j =0
  while(j<5){
    println("current value of j is : "+ j)
    j+=1
  }

  // IMMUTABLE
  val li = List(1,2,3,4)
  //li[2] = 6  illegal assignment

  // ANONYMOUS FUNCTION
  val anony = (e:Int) => e+1
  println(anony(4))

  // PARTIALLY APPLIED FUNCTION
  def fun(n:Int, m:Int):Int = n+m
  val pr = fun(6,_:Int)
  println(pr(7))

  // CURRYING
  def cur(f:Int)(g:Int):Int = f*g
  var cur_fun = cur(6)_
  println(cur_fun(8))

  // CLOSURE
  def clos(p:Int):Int = (p*r*t)/100
  val r = 10
  val t = 20
  println(clos(5000000))

}
