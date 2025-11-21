object ZigZagConversion extends App{
  def convert(s: String, numRows: Int): String = {
    if (s.length == 1 || numRows > s.length) {
      s
    } else {
      var idx = 0
      var d = 1

      val rows = new Array[List[Char]](numRows)

      for (i <- 0 to numRows - 1) {
        rows(i) = List[Char]()
      }

      s.foreach(c => {
        rows(idx) :+ c
        if (idx == 0) {
          d = 1
        } else if (idx == numRows - 1) {
          d = -1
        }
        idx += d
      })

      val sb = new StringBuilder()
      for (row <- rows) {
        for (x <- row) {
          sb.append(x)
        }
      }
      sb.toString()
    }
  }

  convert("PAYPALISHIRING",4)
}
