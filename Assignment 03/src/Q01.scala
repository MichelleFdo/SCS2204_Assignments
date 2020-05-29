object Q01 extends App{
  def  prime(p:Int,x:Int=2):Boolean= x match {
    case x if(x==p) => true
    case x if GCD(p,x)>1 => false
    case x => prime(p,x+1)
  }
  def GCD(a:Int,b:Int):Int=b match{
    case 0 => a
    case b if b>a => GCD(b,a)
    case _ => GCD(b,a%b)
  }

  println("Is 8 a prime: ",prime(8))
  println("Is 2 a prime: ",prime(2))
  println("Is 7 a prime: ",prime(7))
}
