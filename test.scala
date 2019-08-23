package testing

object test {
  
  def Rf(a:String,n:Int):String = {
    
    if (n==1) a
    else a+Rf(a,n-1)
    
  }
  
  
  def main(args: Array[String]): Unit = {
    
  
    println(Rf("hello ",1))
    
    
  }
}