package week4.chap01.practice

trait List[T] {
  def isEmpty: Boolean
  def head:T
  def tail: List[T]
}

class Cons[T](val head:T, val tail:List[T]) extends List[T] {
  def isEmpty():Boolean = False
  def something():Boolean = False
}

class Nil[T] extends List[T] {
  def isEmpty:Boolean = True
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
    
}

object List {
  // List(1,2)
  def apply[T](x1:T, x2:T):List[T] = new Cons(x1, new Cons(x2, new Nil))
}

object Main extends App {
  val oneTwo = List(1,2)
  val one = oneTwo.head
  val two = oneTwo.tail.head

}