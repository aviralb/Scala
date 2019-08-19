package myscala

object SetsInScala {
  
  var myset:Set[Int]=Set(1,2,3,4,5,6,7)
  
  val myset2:Set[Int]=Set(4,5,6)
  
  def main(args: Array[String]): Unit = {
    
    println(myset+20)   
    println(myset)
    println(myset(8)) //number persent or not will return boolean vale
    
    println(myset.intersect(myset2))
    
    println(myset.union(myset2))
    
    println(myset.max)
    
    println(myset.min)
}
}