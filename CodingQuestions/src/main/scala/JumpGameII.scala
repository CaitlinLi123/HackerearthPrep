object JumpGameII {

  def main(args: Array[String]): Unit = {
    println(jump(Array(2,3,1,1,4)))
  }

  def jump(nums: Array[Int]): Int = {
    var jumps, farthest, curr = 0

    for (i <- 0 to nums.length - 2) {
      farthest = math.max(farthest, i + nums(i))

      if (i == curr) {
        jumps += 1
        curr = farthest
      }
    }

    jumps
  }

}
