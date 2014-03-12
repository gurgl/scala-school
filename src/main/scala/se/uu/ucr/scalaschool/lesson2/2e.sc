
// Type Designators && Tuples
// Type designator
type EnSiffra = Int
val i:EnSiffra = 1

// Tuple1...X.
val Tuple2(c,d) = Tuple2(1,2)

def treSaker =  (3*230, "aasdf", false)

val (e,f,g) = treSaker

type EnLiteMerKravandeTyp = Map[String,(Double,String)] with Serializable

def tarKravandeTyper(d:EnLiteMerKravandeTyp) = d.get("enNyckel")





