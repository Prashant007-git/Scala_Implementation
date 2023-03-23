object class_object extends App{
  //CLASS
  class calculator{
    def add(a:Int,b:Int):Int = a+b
    def sub(a:Int,b:Int):Int = a-b
    def mul(a:Int,b:Int):Int = a*b
    def div(a:Int,b:Int):Int = a/b
  }
  // OBJECT
  val ob = new calculator
  println(ob.add(8,9))
  println(ob.sub(89,9))
  println(ob.mul(9,4))
  println(ob.div(81,3))
  object Timer {
    var count = 0

    def currentCount(): Long = {
      count += 6
      count
    }
  }
  println(Timer.currentCount()) // no need to create instance of the object

  // TRAITS
  trait Animal {
    val animal_breed: String
  }
  trait Color {
    val animal_color: String
  }
  class dog extends Color with Animal{
    val animal_color = "Black"
    val animal_breed = "Dog"
  }
  class cat extends Color with Animal{
    val animal_color = "White"
    val animal_breed = "Cat"
  }
  val dog1 = new dog
  val cat1 = new cat
  println("color of dog1 is: ",dog1.animal_color)
  println("color of cat1 is: ",cat1.animal_color)
  // CASE CLASS
  case class Student(name: String, school: String, marks: Int)
  val name1 = Student("Prashant", "xyz school", 95)
  println(name1.school)
}
