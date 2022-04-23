package functions_basics

object MethodCalling {

  def myFunc(a: Int, b: Int): Int = {
    return a+b;
  }

  def main(args: Array[String]): Unit = {
    println(myFunc(9,10));
  }

}
