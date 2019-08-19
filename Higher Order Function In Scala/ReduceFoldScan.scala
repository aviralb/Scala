package myscala

object ReduceFoldScan {
  val lst=List(1,2,3,4,5,6,7)
  val lst2=List("A","B","C","D")
  
  def main(args: Array[String]): Unit = {
    
    println(lst.reduceLeft(_+_))
    println(lst2.reduceLeft(_+_))
    
    println(lst.reduceLeft((x,y)=>{println(x+","+y);x+y;}))
    
    println(lst.reduceLeft(_-_))
    println(lst.reduceRight(_-_))
    
    println(lst.foldLeft(100)(_+_))
    println(lst2.foldLeft("z")(_+_))
    
    println(lst.scanLeft(100)(_+_))
    println(lst.scanLeft("z")(_+_))
    
  }
}