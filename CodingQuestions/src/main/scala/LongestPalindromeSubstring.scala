

object LongestPalindromeSubstring {

  def longestPalindrome(s: String): String = {
    var start, end = 0

    for (i <- 0 to s.length - 1) {
      val odd = expandAroundCenter(s, i, i)
      val even = expandAroundCenter(s, i, i + 1)
      val maxLen = math.max(odd, even)

      if (maxLen > end - start) {
        start = i - (maxLen - 1) / 2
        end = i + maxLen / 2
      }
    }

    s.substring(start, end + 1)
  }

  def expandAroundCenter(s: String, left: Int, right: Int): Int = {
    var l = left
    var r = right
    while (l >= 0 && r < s.length && s.charAt(l) == s.charAt(r)) {
      l -= 1
      r += 1
    }
    return r - l - 1
  }

}
