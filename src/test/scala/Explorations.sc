// iota(10) // => List(0,1,2,3,4,5,6,7,8,9,10)
// -- maybe I must use ana and coalgebra

import higherkindness.droste._
import higherkindness.droste.data._
import higherkindness.droste.syntax.all

def iota(n: Int) = Coalgebra[Option, Int]:
  i => if i < n then Some(i + 1) else None

// stack overflow
// scheme.ana(iota(1000000)).apply(0)

val toInt = Algebra[Option, Int]:
  case None => 0
  case Some(i) => i * i + 1

scheme.hylo(toInt, iota(10)).apply(7)

//times("foo", 3) // => List("foo", "foo", "foo")
// -- maybe I must use ana, coalgebra, and the other thing