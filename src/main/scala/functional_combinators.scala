import org.apache.spark.{SparkConf, SparkContext}
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
  // fold()
  val num2 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val num3 = num2.fold(0)((m: Int, n: Int) => m + n)
  println(num3)
  // parallelize()

  val conf = new SparkConf().setAppName("MyApp").setMaster("local[*]")
  val sc = new SparkContext(conf)

  val data = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val rdd = sc.parallelize(data)

  val sum = rdd.reduce(_ + _)
  println("Sum: " + sum)

  sc.stop()

}
