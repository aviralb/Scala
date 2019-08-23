package testing

object FibonacciSeries {
  
  println("Enter the number to find fibonacci \n")
  
  val n=scala.io.StdIn.readInt() 
  
  def fibonacci(n:Int):Int=
    if (n<=2) 1
    else fibonacci(n-1)+fibonacci(n-2)
  
  
  def main(args: Array[String]): Unit = {
    
    println(fibonacci(n))  
      
      
  }
}