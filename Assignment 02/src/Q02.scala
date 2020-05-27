object Q02 extends App{
  val variationForOneRupee =20/5
  def count(price:Double)                  : Double = 120-(price-15)*variationForOneRupee
  def income(price:Double)                 : Double = count(price)*price
  def cost(price:Double)                   : Double = 500+count(price)*3
  def profit(price:Double)                 : Double = income(price) - cost(price)
  def betterPrice(): Unit = {
    var i=5;
    while (i<50)
    {
      println("Count  Price   income    cost    profit")
      println(count(i), "   ", i, "   ", income(i), "  ", cost(i), "   ", profit(i))
      i+=5
    }

  }
  betterPrice()
}