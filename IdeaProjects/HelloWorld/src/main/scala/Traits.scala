object Traits extends  App{

  /**
    * Traits are types containing certain fields and methods. Multiple traits can be combined.
    * You can define traits with trait keyword.
    */
  trait Greeter {
    def greet(name: String): Unit=
    println("Hello, " + name + "!")
  }

  /**
    * Traits can also have default implementations.
    */
/*  trait Greeter {
    def greet(name: String): Unit =
      println("Hello, " + name + "!")
  }*/
  class DefaultGreeter extends Greeter

  class CustomizableGreeter(prefix: String, postfix: String) extends Greeter {
    override def greet(name: String): Unit = {
      println(prefix + name + postfix)
    }
  }

  val greeter = new DefaultGreeter()
  greeter.greet("Scala developer") // Hello, Scala developer!

  val customGreeter = new CustomizableGreeter("How are you, ", "?")
  customGreeter.greet("Scala developer") // How are you, Scala developer?
}
