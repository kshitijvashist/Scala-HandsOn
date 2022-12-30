package functions_basics

import java.util.UUID

object CalledByName extends App {

  def printGivenTimeCallByValue(time: UUID): Unit = {
    println(s"Print Random UUID: $time")
    println(s"Print Random UUID Again: $time")
  }

  def printGivenTimeCallByName(time: => UUID): Unit = {
    println(s"Print Random UUID: $time")
    println(s"Print Random UUID Again: $time")
  }

  printGivenTimeCallByValue(UUID.randomUUID())
  printGivenTimeCallByName(UUID.randomUUID())
}
