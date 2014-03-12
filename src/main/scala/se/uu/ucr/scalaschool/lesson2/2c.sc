
// Option! Inte en del av språket utan bibiliotekt. Ett sätt att hantera null

var s:Option[Int]  = Some(4)

s * 3

s = None

try { s.get * 3 } catch { case _: Throwable => println("Noos") }

s.getOrElse(23) * 5

if(s.isDefined) s.get * 3 else 0




















