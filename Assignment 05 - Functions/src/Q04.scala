object Q04 extends App{

  class Account(id:String, x:Int, y:Double) {
      val nic = id
      val accNo = x
      var money = y
      override def toString = "NIC: " + id + " " + "Acc no: " + accNo + " " + "Money : " + money

      def transfer(a: Account, amount: Double) =
      {
        money = money - amount
        a.money += amount
      }
      def + (acc:Account) = new Account(nic, accNo,this.money + acc.money);
  }


  var Accounts : List [Account] = List()
  Accounts = Accounts :+ new Account ("981370730v",11111, -500)
  Accounts = Accounts :+ new Account ("982365478v", 22222, 400)
  Accounts = Accounts :+ new Account ("654789123v",44444, 500)
  Accounts = Accounts :+new Account ("666221095v",55555, 1500)

  val findNeg = (Accounts : List[Account]) => Accounts.filter(account=>account.money<0)
  println("Negative Balance Accounts: ")
  val negAccounts = findNeg(Accounts).toIterator;
  while(negAccounts.hasNext)
    {
      println(negAccounts.next())
    }

  val sumOfAllAccounts = (l: List[Account])=>l.reduce((p, q)=>(p+q))
  println("sum Of All Accounts : Rs." + sumOfAllAccounts(Accounts).money)

  val overdraft = (bank:List[Account]) => Accounts.filter(account=>account.money<0);
  val interest = (bank:List[Account]) => Accounts.map((account:Account) => if(account.money<0) new Account(account.nic,account.accNo,account.money+account.money*0.1) else new Account(account.nic,account.accNo,account.money+account.money*0.05));
  println("After Adding interestes to the Accounts: ")
  val accountBalance = interest(Accounts).toIterator;
  while(accountBalance.hasNext)
  {
    println(accountBalance.next())
  }
}