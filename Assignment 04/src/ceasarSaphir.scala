object ceasarSaphir extends App {
  val msg="Im hungry"
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ "

  val encrypt = ( c: Char, key: Int, a:String) => a ((a.indexOf( c.toUpper) + key + a.size) % a.size)
  val decrypt = ( c: Char, key: Int, a:String) => a ((a.indexOf( c.toUpper) - key + a.size) % a.size)
  val cipher = (algo: ( Char, Int, String) => Char, s:String, key:Int, a:String) => s.map(algo(_,key,a))

  val emsg = cipher (encrypt, msg, 3, alphabet)
  val dmsg = cipher (decrypt, emsg, 3, alphabet)

  println("Secret message : " + msg)
  println("Encrypted Message : " + emsg)
  println("Decrypted Message : " + dmsg)

}
