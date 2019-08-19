object HigherOrderFunction {

  def math(x:Double,y:Double,f:(Double,Double)=>Double):Double=f(x,y)
  
  def main(args: Array[String]){
    
    //val result=math(20,30,(x,y)=>x+y) //for addition 
    
    //val result=math(20,30,(x,y)=>x*y) //for multiplication
    
    // val result=math(20,30,(x,y)=>x-y) //for Substraction
    
    //finding Minimum value between them
    
    val result=math(20,30,(x,y)=>x min y)
    
    //finding maximum value b/w them
    
    val max=math(20,30,(x,y)=>x max y)
    
    println(result)
    
    println(max)
  }
  
}