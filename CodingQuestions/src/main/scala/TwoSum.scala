import scala.util.control.Breaks.{break, breakable}

object TwoSum{
  def main(args: Array[String]): Unit = {
  }

  def twoSum(nums:Array[Int],target:Int):Array[Int]={
    val hashmap = nums.zipWithIndex.toMap;
    var res = Array(-1, -1)
    breakable {
      for (idx <- nums.indices) {
        val rest = target - nums(idx)
        if (hashmap.contains(rest) && hashmap(rest) != idx) {
          res = Array(idx, hashmap(rest))
          break()
        }
      }
    }
    res
  }
}
