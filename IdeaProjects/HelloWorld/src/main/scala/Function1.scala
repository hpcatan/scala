import java.util.Random

import scala.math._
object Function1 extends  App{
    var a:Int =2
    a += 2
    a.+=(2)
   print(a)

  println(sqrt(2))
  println(pow(3,3))
  println(min(3,Pi))
  println(BigInt.probablePrime(100,scala.util.Random))
  /**
    * 类名(xxx) 调用的是伴身对象 == 类.apply(xxx)
    *
    */
  println("crazy"*3)
  println(max(2,3))

  println( BigInt.->(2))
  println( "String".drop(2))//丢弃前2个字符
  println( "String".dropRight(2))//丢弃后2个字符
  println( "String".takeRight(2))//只要最后2个字符




}
