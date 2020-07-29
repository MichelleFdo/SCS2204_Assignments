object Q02 extends App{
  class Rational(x: Int, y: Int) {
    def numer = x
    def denom = y
    def add(r: Rational) =
      new Rational(numer * r.denom + r.numer * denom, denom * r.denom)
    def sub(r: Rational) =
      new Rational(numer * r.denom - r.numer * denom, denom * r.denom)
    override def toString = s"$numer/$denom"
  }
  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)
  val ans = x.sub(y).sub(z)
  println(ans)

}
