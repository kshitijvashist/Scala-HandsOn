package functions_basics

object DefaultParameters extends App{
  def calculateWithDefValues(radius:Int=10):Unit=println(radius*5)

  calculateWithDefValues()
  calculateWithDefValues(4)
}
