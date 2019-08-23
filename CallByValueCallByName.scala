package evening

object CallByValueCallByName {
  
  def callByValue(x: Int) = {
  println("x1=" + x)
  println("x2=" + x)
}

def callByName(x: => Int) = {
  println("x1=" + x)
  println("x2=" + x)
  
}
  
  
  def main(args: Array[String]): Unit = {
    
    println(callByValue(5))
    println(callByName(5))
    
    
    
  }
}