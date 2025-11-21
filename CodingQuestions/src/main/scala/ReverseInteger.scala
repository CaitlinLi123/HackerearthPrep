import scala.util.Try

object ReverseInteger {
  def reverseInteger(num:Int): Int = {
    Try(num.sign*num.abs.toString.reverse.toInt).getOrElse(0)
  }
}
