object Q01 extends App {
  class Rational(x: Int, y: Int) {
    def numer = x
    def denom = y
    def neg =
      new Rational(-numer,denom)
    override def toString = s"$numer/$denom"
  }
  val x = new Rational(1,3)
  println(x.neg)

}
