package myscala

object OptionsInScala {
  
  val lst=List(1,2,3,4,5,6,7)
  
  val map=Map(1->"Tom",2->"Max",3->"John")
  
  
  def main(args: Array[String]): Unit = {
    
    println(lst.find(_>4))
    
    println(lst.find(_>10).getOrElse("No Number Found"))
    
    
  }
}