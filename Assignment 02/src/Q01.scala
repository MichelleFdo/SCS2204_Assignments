object Q01 extends App {
  def normal(normal_hours : Int)   : Double = normal_hours*150
  def OT(ot_hours: Int)            : Double = ot_hours*75
  def salary(h1:Int, h2:Int)       : Double = normal(h1)+OT(h2)
  def tax(sal: Double)             : Double = sal*0.1

  def finalSal(h1:Int ,h2:Int)     : Double = salary(h1,h2)-tax(salary(h1,h2))
    print(finalSal(40,20))

}
