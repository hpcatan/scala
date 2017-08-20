object MethodNew {
  /**
    *函数定义：名称，参数，函数体
    * 递归函数需要指定返回类型
    *
    */

  def abs(x:Double): Double = if(x>=0) x else -x

  def fac(n:Int):Int = if(n<=0) 1 else n* fac(n-1)




  def main(args: Array[String]): Unit = {
    print(fac(3))
  }




}
