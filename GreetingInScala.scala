package testing

object GreetingInScala {
  
  def greeting(name:String,age:Int):String=
    "Hi My name Is "+ name +" And My age is  "+ age + " Year Old"
  
  
  def main(args: Array[String]): Unit = {
    
    println(greeting("Aviral",25))
    
    
  }
  
}