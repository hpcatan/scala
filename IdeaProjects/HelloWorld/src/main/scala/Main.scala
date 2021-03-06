object Main {
  def main(args: Array[String]): Unit ={
    class Point(var x: Int, var y: Int) {

      def move(dx: Int, dy: Int): Unit = {
        x = x + dx
        y = y + dy
      }

      override def toString: String =
        s"($x-$y)"
    }

    val point1 = new Point(2, 3)
    //point1.x  // 2
    println(point1)  // prints (x, y)
    println("Hello, Scala developer!")
  }


  val list: List[Any] = List(
    "a string",
    732,  // an integer
    'c',  // a character
    true, // a boolean value
    () => "an anonymous function returning a string", //this is a function
    (x: Int) => x + 1
  )

  list.foreach(element  => println(element))

  /**
    *
    * Byte=>Short=>Int=>Long=>Float=>Double
    *               ||
    *              char
    */

  var x: Long = 987654321
  var y: Float = x  // 9.8765434E8 (note that some precision is lost in this case)

  val face: Char = '☺'
  val number: Int = face  // 9786


  val x1: Long = 987654321
  var y1: Float = x1  // 9.8765434E8
  //val z: Long = y  // Does not conform

}
