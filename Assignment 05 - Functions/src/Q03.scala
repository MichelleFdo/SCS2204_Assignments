object Q03 extends App {
class Account(id:String, x:Int, y:Double) {
  val accNo = x
  var money = y

  override def toString = "NIC: " + id + "Acc no: " + accNo + " " + "Money : " + money

  def transfer(a: Account, amount: Double) = {
    money = money - amount
    a.money += amount
  }
}
    val Amal = new Account ("981370730v",11111, 500)
    val Kamal = new Account ("982365478v", 22222, 400)
    Amal.transfer(Kamal, 200)

  println("Amal " + Amal)
  println("Kamal " + Kamal)

}
