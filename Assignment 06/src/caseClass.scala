object caseClass extends App {
  case class point (a:Double , b:Double)
  {
    def x=a
    def y=b

    def +(p:point)= point(this.x+x, this.y+y)
    def move(dx:Double,dy:Double) = point(this.x+dx,this.y+dy)
    def reverse()= point(this.y, this.x)
    def distance(p:point) = scala.math.sqrt(scala.math.pow(this.x -p.x , 2) + scala.math.pow(this.y -p.y, 2))
  }

  val p1= new point(3,5)
  val p2= new point(7,4)
  println("point 1 : "+p1)
  println("point 2 : "+p2)

  val p3=p2.copy()
  println("copy of point2 : " + p3)

  //question 01
  val p4=p1+p2
  println("addition of p1 and p2 :"+ p4)

  //question 02
  val p5=p1.move(2,2)
  println(p1+" after moving : "+p5)

  //question 03
  val p6=p1.reverse()
  println("reverse of "+p1+"is : "+p6)

  //question 04
  val p7=p1.distance(p2)
  println("distance between "+p1+"and "+p2+"is "+p7)

}
