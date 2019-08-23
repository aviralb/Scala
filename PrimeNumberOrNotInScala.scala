package testing

object PrimeNumberOrNotInScala {
  
  println("Enter A Number to find prime Number \n")
  
  val n=scala.io.StdIn.readInt()
  
  def prime(n:Int):Boolean={
    def primeUntil(t:Int):Boolean=
      if (t<=1) true
      else n%t!=0 && primeUntil(t-1)
     primeUntil(n/2)  
  }
  
  
  
  def main(args: Array[String]): Unit = {
    
    println(prime(n))
    
  }
  
}