object LetterCombinationsofaPhoneNumber {
  def letterCombinations(digits: String): List[String] = {
    if (digits.isEmpty) return List.empty

    val hashmap = Map(
      '2' -> "abc",
      '3' -> "def",
      '4' -> "ghi",
      '5' -> "jkl",
      '6' -> "mno",
      '7' -> "pqrs",
      '8' -> "tuv",
      '9' -> "wxyz"
    )

    // acc: accumulator
    digits.foldLeft(List("")) {
      (acc, digit) =>
        for {
          prefix <- acc
          letter <- hashmap.getOrElse(digit, "")
        } yield prefix + letter
    }
  }
}
