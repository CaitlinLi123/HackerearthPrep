object ThreeSum {

  def main(args: Array[String]): Unit = {
    val nums = Array(-1,0,1,2,-1,-4)
    println(threeSum(nums))
  }

  def threeSum(nums: Array[Int]): List[List[Int]] = {
    var res = List[List[Int]]()
    val numsSorted = nums.sorted

    for (i <- 0 to numsSorted.length - 2) {
      if (!(i > 0 && numsSorted(i) == numsSorted(i - 1))) {
        var j = i + 1
        var k = nums.length - 1
        while (j < k) {
          val total = numsSorted(i) + numsSorted(j) + numsSorted(k)

          if (total > 0) {
            k -= 1
          }
          else if (total < 0) {
            j += 1
          }
          else {
            res = res :+ List(numsSorted(i), numsSorted(j), numsSorted(k))
            j += 1

            while (numsSorted(j) == numsSorted(j - 1) && j < k) {
              j += 1
            }
          }
        }
      }
    }

    res
  }

}
