object Object extends App{

  /**
    *
    * Objects are single instances of their own definitions. You can think of them as singletons of their own classes.
    * You can define objects with the object keyword.
    */
  object IdFactory {
    private var counter = 0
    def create(): Int = {
      counter += 1
      return counter
    }
  }

  val newId: Int = IdFactory.create()
  println(newId) // 1
  val newerId: Int = IdFactory.create()
  println(newerId) // 2
}
