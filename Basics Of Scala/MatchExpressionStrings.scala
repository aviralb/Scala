object MatchExpressionStrings {

  def main(args: Array[String]) {
    
    val age="20"
    
    age match {
      
      case "20" =>println(age)
      case "18" =>println(age)
      //so that I can add more cases
      
      case _=>println("ye default hai bhai")
    }
    
    
  }
  
}