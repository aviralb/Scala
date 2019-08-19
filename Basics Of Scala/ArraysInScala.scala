//Scala Arrays
import Array._
object ArraysInScala {
  
  val myarray=Array(1,2,3,4,5,6,7,8,9)
  val myarray2=Array(8,7,6,5,4,3,2,1)
  
  def main(args: Array[String]): Unit = {
    
  
  
  println(myarray.length)
  
  println(myarray2.length)

  val res=concat(myarray,myarray2)
  
  for(x<-res)
  println(x)
  
}
  
}