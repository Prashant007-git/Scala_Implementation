object access_modifiers extends App{
  class abc {
    private var a: Int = 123
    protected var b: Int = 333
    var c: Int = 444
    def display() {
      a = 8
      println(a)
    }
    def display1(): Unit = {
      b = 9
      println(b)
    }
    def display2(): Unit = {
      println(c)
    }
  }
  class pri extends abc { // sub class of abc
    def prin(): Unit = {
      // println(a) access denied because private var can't be accessed from sub class
      println(b)  // protected var can be accessed from sub class
    }
  }
  var e = new abc()
  // e.a = 66  private can't be accessed outside class
  e.display()
  var f = new abc()
  // f.b = 66  protected can't be accessed outside class and sub-class
  f.display1()
  var g = new abc()
  g.c = 66 // No-modifier can be accessed from anywhere
  g.display2()
  var h = new pri()
  h.prin()
}



