package functions_basics

object ClosureFunction {
  def main(args: Array[String]): Unit = {
    println(callToClosureFunction(10,30));
    println(callToClosureFunctionWithString("Sachin ","Tendulkar"));
    callToClosureFunctionWithBothStrings("Kapil ","Dev");
  }
  val callToClosureFunction=(a:Int,b:Int)=>a+b;
  val callToClosureFunctionWithString=(a:String,b:String)=>a+b;
  val callToClosureFunctionWithBothStrings=(a:String,b:String)=>println(s"Best Cricket Player is $a $b");

}
