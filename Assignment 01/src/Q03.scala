object Q03 extends App{

  def normalPrice(x: Double,n:Int)=
  {
    x*n
  }
  def discount (d: Double,x: Double,n:Int)=
    {
      x*n*d
    }
  def shippingCost(p:Double, q:Double, n:Int)=
    {
      if (n>50)
        {
          p+(n-50)*q;
        }
      else
        {
          p;
        }
    }
  def wholeSalePrice(n:Int )=
  {
    normalPrice(24.95,n)-discount(0.4,24.95,n)+shippingCost(3,0.75,n)
  }
  println("Normal price : ", normalPrice(24.95,60))
  println("discount: ", discount(0.4,24.95,60))
  println("Shipping cost :", shippingCost(3,0.75,60))
  println("The cost is",wholeSalePrice(60))
}
