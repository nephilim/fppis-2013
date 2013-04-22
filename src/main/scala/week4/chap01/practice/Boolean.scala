package week4.chap01.practice

abstract class Boolean {
	def ifThenElse[T](t: => T, e: => T):T
	
	def &&(x: => Boolean): Boolean = ifThenElse(x, False)
	def	||(x: => Boolean): Boolean = ifThenElse(True, x)
	def unary_!(): Boolean = ifThenElse(False, True)
	
//	def ==
//	def !=
	  
}

object True extends Boolean {
	def ifThenElse[T](t: => T, e: => T):T = t
}

object False extends Boolean {
	def ifThenElse[T](t: => T, e: => T):T = e
}


object main extends App {
  println()
}