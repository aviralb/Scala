//It is a technique of transforming a function
//that takes multiple argument into a function
//that takes a single argument
//like addition programe take two args


object CurryingInScala {

  def add(x:Int)=(y:Int)=>x+y
  
  def main(args: Array[String]): Unit = {
    
    println(add(10)(20))
    
    //or
    
    val sum2=add(100)
    
    println(sum2(90))
    
  }
  
}