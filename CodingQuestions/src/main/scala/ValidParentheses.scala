object ValidParentheses {
  def main(args: Array[String]): Unit = {
    val testcases = List("()","()[]{}","(]","([)]","{[]}")
    testcases.foreach(test => println(isValid(test)))
  }

  def isValid(s: String): Boolean = {
    val hashmap = Map(
      '(' -> ')',
      '{' -> '}',
      '[' -> ']'
    )

    val stack = scala.collection.mutable.Stack[Char]()

    s.foreach {
      case c if hashmap.contains(c) => stack.push(c)
      case _ if stack.isEmpty => return false
      case c if !hashmap(stack.pop()).equals(c) => return false
      case _ =>
    }

    stack.isEmpty
  }
}
