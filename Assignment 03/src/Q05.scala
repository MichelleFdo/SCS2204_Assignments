object Q05 extends App{
  def isEven(n:Int):Boolean = n match
  {
    case 0 => true
    case _ => isOdd(n-1)
  }
  def isOdd(n:Int) = !isEven(n)

  def addEven(n:Int, sum:Int=0): Unit =
  {
     if (n>0)
       {
         if (isEven(n:Int))
           {
             addEven(n-1,sum+n)
            }
          else addEven(n-1,sum)
    }
    else
       {
         print(sum)
       }
  }
  addEven(6)
}
