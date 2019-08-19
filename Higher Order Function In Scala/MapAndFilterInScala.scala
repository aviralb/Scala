package myscala

object MapAndFilterInScala {
  
  val lst=List(1,2,3,4,5,6,7)
  
  val mymap=Map(1->"Aviral",2->"Rahul",3->"Ram")

  def main(args: Array[String]): Unit = {
    
    
    println(lst.map(_*2)) //or you can use below one
    
    println(lst.map(x=>x*2))
    
    println(lst.map(x=>x+2))
    
    println(lst.map(x=>x/2))
    
    println(lst.map(x=>"hi"+x))
    
    println(mymap.mapValues(x=>"hi"+x))
    
    println("Aviral".map(_.toUpper))
    
    println(List(List(1,2,3),List(3,4,5)).flatten)
    
    println(lst.flatMap(x=>List(x,x+1)))
    
    println(lst.map(x=>List(x,x+1)))
    
    //Filter Function
    
    println(lst.filter(x=>x%2==0))  //even values
  
    println(lst.filter(x=>x%2!=0)) //odd values
  }



}