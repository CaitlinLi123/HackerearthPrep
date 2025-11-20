object LongestSubstringWithoutRepeatingCharacters {

  def lengthOfLongestSubstring(s: String): Int = {
    var res = 0
    var l, r = 0
    var set = Set[Char]()

    while (r < s.length) {
      if (!set.contains(s(r))) {
        set += s(r)
        res = math.max(res, r - l + 1)
        r += 1
      } else {
        while (set.contains(s(r))) {
          set -= s(l)
          l += 1
        }
      }
    }

    res
  }
}
