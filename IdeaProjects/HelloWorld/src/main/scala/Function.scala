object Function extends App{
  println((x: Int) => x + 1)

  val addOne = (x: Int) => x + 1
  println(addOne(1)) // 2

  val add = (x: Int, y: Int) => x + y
  println(add(1, 2)) // 3

  val getTheAnswer = () => 42
  println(getTheAnswer()) // 42

}
