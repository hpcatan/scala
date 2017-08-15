object Method extends App{
  /**
    * Methods are defined with the def keyword. def is followed by a name, parameter lists, a return type, and a body.
    * @param x
    * @param y
    * @return
    */
  def add(x: Int, y: Int): Int = x + y
  println(add(1, 2)) // 3


  /**
    * Notice how the return type is declared after the parameter list and a colon : Int.
    * Methods can take multiple parameter lists.
    * @param x
    * @param y
    * @param multiplier
    * @return
    */
  def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
  println(addThenMultiply(1, 2)(3)) // 9

  /**
    *  no parameter lists at all.
    * @return
    */
  def name: String = System.getProperty("name")
  println("Hello, " + name + "!")

  /**
    *
    *
    * Methods can have multi-line expressions as well.
    * @param input
    * @return
    */
  def getSquareString(input: Double): String = {
    val square = input * input
    square.toString
  }
  println(getSquareString(3))

}
