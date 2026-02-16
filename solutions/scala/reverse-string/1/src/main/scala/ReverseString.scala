object ReverseString {
  def reverse(str: String): String = {
   (for( index <- str.length-1 to 0 by -1) yield str(index)).mkString
  }
}
