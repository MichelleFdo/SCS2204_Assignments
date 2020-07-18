object sipherMethod2 extends App{
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val shift = scala.io.StdIn.readLine("Shift by:").toInt+alphabet.size
    val inputText =scala.io.StdIn.readLine("Secret Message : ")
    val encryptText = inputText.map((c: Char)=>
    {
      val x=alphabet.indexOf(c.toUpper)
      if (x== -1)
      {
        c
      }
      else
      {
        alphabet((x+shift)%alphabet.size)
      }
    })
    val decryptText = encryptText.map((c: Char)=>
    {
      val x=alphabet.indexOf(c.toUpper)
      if (x== -1)
      {
        c
      }
      else
      {
        alphabet((x+alphabet.size-shift)%alphabet.size)
      }
    })
    println("Encrypted message: "+ encryptText)
    println("Decrypted message: "+ decryptText )

}
