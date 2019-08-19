//scala Strings

object StringsInScala {

 val num1=75
 val num2=75
 
 val str1:String="Hello World"
 
 val str2:String="From Aviral"
 
 def main(args: Array[String]): Unit = {
   
   println(str1.length())
   
   println(str1.concat(str2))
   
   println(str1+str2)
   
   println(num1.compareTo(num2))
   
 }
  
}