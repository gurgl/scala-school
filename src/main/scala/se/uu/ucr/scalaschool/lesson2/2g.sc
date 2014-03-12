
// Kan bland mycket annat användas istället för komplicerade ifsatser och göra beslutets "dimensioner" tydligare

def utred(a:Iterable[Any], b:Boolean, c:Int ) = (a,b,c) match {
  case (m:List[Any], true, i) => "a"
  case (s:Set[Any], false, i) if i > 20 => "b" + s.size
  case (s:Set[Any], w, i) => "c" + w
  case (_, v, 0) => "d"
  case (_,_,_) => "f"
}

utred(Set(1), false, 23)
utred(Set(1), false, 2)
utred(List(1), true, 2)
utred(Map.empty[Int,String], false, 0)
utred(Map.empty[Int,String], false, 1)
utred(Seq(2), false, 2)


