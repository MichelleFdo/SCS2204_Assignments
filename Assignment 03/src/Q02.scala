object Q02 extends App {

    def primeSeq(n:Int,x:Int=2):Unit = {
      if (prime(x)) print(x+",")
      if (x==n) return
      primeSeq(n,x+1)
    }
    def gcd(a:Int,b:Int):Int=b match{
      case 0 => a
      case b if (b>a) => gcd(b,a)
      case _ => gcd(b,a%b)
    }
    def prime(n:Int,x:Int=2):Boolean = x match{
      case x if(x==n) => true
      case x if gcd(n,x)>1 => false
      case x => prime(n,x+1)
    }
    primeSeq(5)

}
