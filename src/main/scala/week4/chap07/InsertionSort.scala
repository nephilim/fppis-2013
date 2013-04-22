package week4.chap07

object InsertionSort {
  def isort(list: List[Int]):List[Int] = list match {
    case List() => List()
    case x::xs => insert(x, isort(xs))
  }                                               
  
  def insert(x: Int,xs: List[Int]):List[Int]= xs match {
    case List() => x :: Nil
    case y::ys => if (x < y) x::xs
                  else y::insert(x, ys)
  }     
}