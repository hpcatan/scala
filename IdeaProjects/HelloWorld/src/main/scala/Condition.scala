object Condition {

  def main(args: Array[String]): Unit = {
    /**
      * for(i <- 表达式) i 的类型是集合的元素类型，作用域一直持续到循环结束
      *
      * 让变量i 遍历表达式中的所有值
      */
    var r=2
    for(i <- 1 to 3)
      r=r*i
      r+=2
    println(r)
    /**
      *
      * 遍历数组
      */
    val s ="hello"
    var sum =0
    for (i <- 0 until s.length)
    sum += s(i)

    println(sum)
    //or
    var sum1 =0
    for(ch <- "hello") {sum1+=ch;println(ch)}
    println(sum1)

    /**
      *
      *生成器后面不带分号，if,form 叫守卫
      *
      *
      */

    for(i<- 1 to 3 ;j<- 1 to 3 if i!=j) print((10*i+j)+" ")
    println("===============")
    for(i <- 1 to 3; from= 4-i;j<- from to 3) print((10*i+j)+" ")
    /**
      *
      * yield 类似缓冲区 会保存临时结果 最后一起输出
      *
      * 输出结果跟第一个生成器类型兼容
      */

     // for(c <- "hello"; i<- 0 to 1) {println(c);println(i)}

    val a =for (c <- "hello"; i<- 0 to 1) yield(c+i).toChar
    println(a)//hieflmlmop    hello是个string

    val b =for(i<- 0 to 1;c <-"hello") yield (c+i).toChar
    println(b) //Vector(h, e, l, l, o, i, f, m, m, p)  0 to 1 是个数组
  }


}
