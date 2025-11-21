object CombinationSum {
  def combinationSum(candidates: Array[Int], target: Int): List[List[Int]] = {
    def backtrack(curr: List[Int], remaining: List[Int], acc: List[List[Int]]): List[List[Int]] = {
      if (curr.sum == target) acc :+ curr
      else if (curr.sum < target && !remaining.isEmpty) {
        val newCurr = curr :+ remaining.head
        val newRemaining = remaining.tail
        val withHead = backtrack(newCurr, remaining, acc)
        val withoutHead = backtrack(curr, newRemaining, acc)
        withHead ++ withoutHead
      } else acc
    }

    backtrack(List(), candidates.toList, List())
  }
}
