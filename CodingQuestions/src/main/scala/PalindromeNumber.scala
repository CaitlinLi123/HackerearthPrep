object PalindromeNumber {
  def isPalindrome(x: Int): Boolean = {
    x.toString.reverse.equals(x.toString)
  }
}
