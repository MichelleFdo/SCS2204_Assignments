import scala.io.StdIn._
object Q06 extends App {
  def fibonacci(n:Int):Int=n match{
    case 0 => 1
    case 1 => 1
    case _ => fibonacci(n-1)+fibonacci(n-2)

      }
  def fibonacciSeq(n:Int): Unit=
    {
      if (n>0) (fibonacciSeq(n-1)) ;
      println(fibonacci(n))
    }
  val k=readLine("enter number : ").toInt
  fibonacciSeq(k)
}
