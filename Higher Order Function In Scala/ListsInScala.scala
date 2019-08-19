package myscala

object ListsInScala {
  
  var mylist:List[Int]=List(1,2,3,4,5,6,7)
  
  val myString:List[String]=List("Max","Tom","Aviral")
  
  def main(args: Array[String]): Unit = {
    
    //mylist(1)=10 list are immutable
    
    println(9::mylist) //but we can append like that 
    
    println("this is my list Integer-- "+ mylist)
    
    println("This is My String List -- "+ myString)
    
    println("this is new list --" +1::5::9::Nil) //It will create new List
    
    println("This is the first number of my list --"+mylist.head)
    
    println("This is last One --"+mylist.tail)
    
    println("This will show list is empty or not --"+mylist.isEmpty)
    
    println("This Will show reverse list --" +mylist.reverse)
    
    println("this will create new list --"+List.fill(6)(3))
    
    println("This will return Maximum number-- "+mylist.max)
    
    println("This will return Minmum number-- "+mylist.min)
    
    mylist.foreach(println) 
    
    
  
  }
  
}