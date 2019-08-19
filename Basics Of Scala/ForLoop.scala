object ForLoop {
  def main(args: Array[String]) {

    for (a<-1 to 5){
      println("i using to "+a)
    }
    
    /// or this 
    
    val lst=List(2,3,4,5,6,7,8,9)
    
    val result = for { i <- lst; if i<9} yield{
      i*i
    }
    
    println(result)
    
  }
}