object Q03 extends App {
def sum(n:Int): Int=
  {
    if (n>0)
    {
      n+sum(n-1)
    }
    else n
  }
  print(sum(5))
}
