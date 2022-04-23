package functions_basics

object ClosureFunction {
  def main(args: Array[String]): Unit = {
    println(callToClosureFunction(10,30));
  }
  val callToClosureFunction=(a:Int,b:Int)=>a+b;


}
