package week4.chap04


class Parent {
  def p() = "p";
}
class Child extends Parent {
  def c() = "c";
}

class MyFunction1 {
  def apply(arg:Parent):Child = {
    arg.p();
    return new Child()
  } 
}

class MyFunction2 {
  def apply(arg:Child):Parent = {
    arg.p();
    arg.c();
    return new Parent()
  } 
}
