object search_algo extends App{
  // BINARY SEARCH
  def binarySearch(arr: Array[Int], target: Int): Int = {
    var left = 0
    var right = arr.length - 1
    while (left <= right) {
      val mid = (left + right) / 2

      if (arr(mid) == target) {
        return mid
      }
      else if (arr(mid) < target) {
        left = mid + 1
      }
      else {
        right = mid - 1
      }
    }
    -1
  }
  val arr = Array(1, 3, 5, 7, 9)
  val target = 5
  val result = binarySearch(arr, target)
  println(result)

  // LINEAR SEARCH
  def LinearSearch(arr:Array[Int], target1:Int):Int = {
    for(i <- 0 until arr.length){
      if(arr(i) == target1){
        return i
      }
    }
    -1
  }
  val target1 = 9
  val result1 = LinearSearch(arr, target1)
  println(result1)
}
