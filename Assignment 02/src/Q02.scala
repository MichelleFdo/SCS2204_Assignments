object Q02 extends App{
  val variationForOneRupee =20/5

  def income(n:Int, price:Double)          : Double = n*price
  def cost(n:Int)                          : Double = 500+n*3
  def profit(n: Int,price:Double)          : Double = income(n,price) - cost(n)
  println("income is",income(120,15))
  println("cost is",cost(120))
  println("profit is",profit(120,15))
  def findBest(profit:Double,cost:Double)  : Double =
}