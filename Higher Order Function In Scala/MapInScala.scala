package myscala

object MapInScala {
  
  val mymap:Map[Int,String]=Map(1->"Aviral",2->"Rahul",3->"Ram")
  
  def main(args: Array[String]): Unit = {
    
    println(mymap)
    
    println(mymap(2))
    
    println(mymap.keys)
    
    println(mymap.values)
    
    println(mymap.isEmpty)
    
    mymap.keys.foreach { key=>
      
      println("key "+key)
      
      println("Value "+mymap(key))
      
      
    }
    
    println(mymap.contains(3))
    
  }
}