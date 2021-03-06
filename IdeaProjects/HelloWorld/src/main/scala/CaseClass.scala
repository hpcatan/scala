object CaseClass extends  App{

  /**
    * Scala has a special type of class called a “case” class. By default,
    * case classes are immutable and compared by value. You can define case classes with the case class keywords.
    * You can instantiate case classes without new keyword.
    * @param x
    * @param y
    */
  case class Point(x: Int, y: Int)

  val point = Point(1, 2)
  val anotherPoint = Point(1, 2)
  val yetAnotherPoint = Point(2, 2)


  if (point == anotherPoint) {
    println(point + " and " + anotherPoint + " are the same.")
  } else {
    println(point + " and " + anotherPoint + " are different.")
  }
  // Point(1,2) and Point(1,2) are the same.

  if (point == yetAnotherPoint) {
    println(point + " and " + yetAnotherPoint + " are the same.")
  } else {
    println(point + " and " + yetAnotherPoint + " are different.")
  }
  // Point(1,2) and Point(2,2) are different.


}
