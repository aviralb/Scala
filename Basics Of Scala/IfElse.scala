object IfElse {
  def main(args: Array[String]) {

    val x = 20
    var res = ""

    if (x == 20) {
      //println("x==20")

      res = "x==20"

    } else {

      res = "x!=20"
      //println("x!=20")
    }

    println(res)
    
    //Another way to If Else Loop

    println(if (x == 20) "x==20" else "x!=20")
    // or println(res2)

  }

}