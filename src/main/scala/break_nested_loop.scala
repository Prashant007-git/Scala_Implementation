import scala.util.control.Breaks._
object break_nested_loop extends App {
  breakable {
    for (i <- 1 to 10) {
      for (j <- 1 to 10) {
        if (i == 5 && j == 5) {
          // break out of the loops
          break
        }
        println(s"($i, $j)")
      }
    }
  }
}
