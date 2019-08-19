object PartiallyAppliedFunction {
def main(args: Array[String]): Unit = {

  val sum=(a:Int,b:Int,c:Int)=>a+b+c
  
  val f=sum(10,_:Int,_:Int) //Comment this and uncomment below one
  
//  println(sum(10,20,30))
  
  println(f(100,50))  //and comment this also
}  
}