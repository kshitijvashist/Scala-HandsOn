package functions_basics

object CalledByName extends App {

  def printGivenTimeCallByValue(time: Long): Unit = {
    println(s"Print current time: $time")
    println(s"Print current time Again: $time")
  }

  def printGivenTimeCallByName(time: => Long): Unit = {
    println(s"Print current time: $time")
    println(s"Print current time Again: $time")
  }

  printGivenTimeCallByValue(System.nanoTime())
  printGivenTimeCallByName(System.nanoTime())
}
