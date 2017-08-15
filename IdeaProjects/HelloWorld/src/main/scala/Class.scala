object Class extends App{
  val greeter = new Greeter("Hello, ", "!")
  greeter.greet("Scala developer") // Hello, Scala developer!

  /**
    *The return type of the method greet is Unit, which says there’s nothing meaningful to return.
    * It’s used similarly to void in Java and C. (A difference is that because every Scala expression must have some value,
    * there is actually a singleton value of type Unit, written (). It carries no information.)
    * You can make an instance of a class with the new keyword.
    *
    * @param prefix
    * @param suffix
    */
  class Greeter(prefix: String, suffix: String) {
    def greet(name: String): Unit =
      println(prefix + name + suffix)
  }



}
