package testing

object TakingInputFromUserInScala {
  
  println("Enter a Number for Finding Factorial\n")
  
  val n=scala.io.StdIn.readInt() //taking input from user
   
  def factorial(n:Int):Int=
    if (n<=0) 1
    else n*factorial(n-1)
  
  def main(args: Array[String]): Unit = {
    
      println(factorial(n))
      
  }
}