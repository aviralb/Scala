object ScalaClosures {
  
  //A clouser is a function whihc uses one or more
  //variable declared outside this function
  
  var number=20  //yaha ye globle ho gaya hai aur neeche local wala
  
                  //add ho jayega 
  
  val add=(x:Int)=>x+number
  
  def main(args: Array[String]): Unit = {

    number=10
    
    println(add(40))
    
  }
}