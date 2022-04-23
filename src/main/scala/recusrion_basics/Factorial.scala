package recusrion_basics

object Factorial {

  def findFactorial(num: Int): Int = {
    if(num==1)
        1;
    else
      num*findFactorial(num-1);

  }

  def main(args: Array[String]): Unit = {
    println(findFactorial(6));
  }
}
