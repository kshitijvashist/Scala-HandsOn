package basic_operations

object ArithmeticOperation {
  def main(args: Array[String]): Unit = {
    val a = 10;
    var b = 10;
    b=8;
    println(a + b);
    println(a -b);
    println("Multiplication="+a * b);
    println("Division="+a / b);
    println("Modulus="+a % b);
  }

}
