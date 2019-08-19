object FunctionsInScala {

  //addtion of two numbers

  def add(x: Int, y: Int): Int = {
    return x + y
  }

  //multiplication of two numbers
  def multi(x: Int, y: Int): Int = {
    x * y //not madotary to write return
  }

  //division of two numbers
  def divide(x: Int, y: Int): Int = x / y

  //substraction of two numbers
  def sub(x: Int, y: Int): Int = {
    return x - y
  }

  //modulous of numbers

  def mod(x: Int, y: Int) = x % y
  
  def square(x:Int)=x*x  //Sqaure Function
  
  //Now the announmes Funtion 
  

  def main(args: Array[String]) {

    println("addition of two numbers are " + add(45, 15))

    println("multiplication of two numbers are " + multi(5, 10))

    println("division of two numbers are " + divide(6, 9))

    println("Subtract of two numbers are " + sub(45, 6))

    println("Modulous of two numbers are " + mod(10, 50))
    
    println("Square of given number is " + square(45))

    //my anonos funtion
    var addone=(x:Int,y:Int) =>x+y
    
    println("This is my annonums funtion " +addone(300,400))

  }

}