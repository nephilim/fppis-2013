package week4.chap06

object ArithmeticExpression extends App {
  println(Sum(Number(3),Number(5)))
}

trait Expr {
  def eval():Int 
  def show():String
}

case class Number(n: Int) extends Expr {
  def eval():Int = n
  def show = n.toString
}

case class Sum(left: Expr, right:Expr) extends Expr {
  def eval():Int = left.eval() + right.eval()
  def show = "%s + %s = %d".format(left.show, right.show, eval)
}


