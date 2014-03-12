// Pattern matching - centralt i funktionella språk


val EttRegExp = "bbb(a*)".r // Får en unnapply metod


case class ClassVarsArgumentKanMatchas(i:Int,s:String)

def whoami(x:Any) = x match {

  case 1 => "ETT"
  case a:Int => "siffran " + a
  case (a,(b,c)) => "Två saker där ena är två " + a + " samt " +b + " och " + c
  case (a,b) => "Två saker " + a + " " +b
  case head :: tail => "En lista med första element " + head
  case EttRegExp(aaas) => "Antalet a'n är " + aaas.length
  case ClassVarsArgumentKanMatchas(i,"tja") => "Vår Case Class säger " + (i * 2)
  case annat => "Något helt " + annat
}
whoami(23)
whoami(1)
whoami(("a",234))
whoami(List(6,234,7))
whoami("bbaaa")
whoami("bbbaaa")
whoami(ClassVarsArgumentKanMatchas(23,"hejdå"))
whoami(ClassVarsArgumentKanMatchas(45,"tja"))
whoami(2f)


// CASE class
//
// kräver
//  - endast "val" fält (final)
// får
//  - ett object med
//    - unnapply metod,  => Du kan matcha på ett objects construktor argument
//    - apply metod => du kan instantiera classen utan "new"
//  - equals/hashCode,
//  - toString
//  - (advanced - om dessa ärver av en "sealed abstract" basclass - kan kompilatorn avgöra om ett en match på
//    basklassen är "exhaustive" - dvs att du matchat på dessa alla varianter samt tillhörande värderymder
