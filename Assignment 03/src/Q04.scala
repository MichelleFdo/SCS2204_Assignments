object Q04 extends App {
  def isEven(n:Int):Boolean = n match
  {
    case 0 => true
    case _ => isOdd(n-1)
  }
  def isOdd(n:Int) = !isEven(n)
  print(5+" is even? "+isEven(5))

}
