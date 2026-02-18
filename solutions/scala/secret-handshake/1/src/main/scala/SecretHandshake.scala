import scala.collection.mutable.ListBuffer

object SecretHandshake{
  def commands( num:Int):List[String] = {
  val secrets:ListBuffer[String] = ListBuffer()
    
    if( (num & 1) !=0 ) secrets+=("wink")
    if ((num & 2) !=0) secrets+=("double blink")
    if ((num & 4) !=0) secrets+=("close your eyes")
    if ((num & 8) !=0) secrets+=("jump")
    if ((num & 16) !=0) {
      val revSec=secrets.reverse
      return revSec.toList
    }

  secrets.toList
    
  }
}