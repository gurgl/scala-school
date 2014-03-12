// Collections

// Map, Set, List, Seq, Option

// Dessa typer med tillhörande funktioner gör FP till den killer app det är
// i synnerhet
// - filter : Alla patienter -> Delmängd som är män och har diagnos XYZ
// - map  : Alla patienter -> allas namn
// - find : ...
// - flatmap : Alla patId'n -> alla deras registeringar
// - fold : Alla patId'n -> total vårdtid

val list1 = List(1,2,5,3,7)

// filter

def merAnTva(i:Int) = i > 2
list1.filter ( merAnTva _ )
list1.filter ( (x:Int) => x > 2 )
list1.filter ( x => x > 1 )
list1.filter ( _ > 1 ) // för den late. Svårläsligt
(1 until 29).filter( x => x % 4 == 0)


// map

list1.map( x => x.toString * x )

// find

val list2 = List("Ett","Tvåå","Tree")
list2.find( x => x == "Ett")
list2.find( x => x == "Finns ju inte")
list2.find( x => x.endsWith("ee")).foreach( x => println(x * 3))

// fold

list1.foldLeft(0)((sum,element) => sum + element) // summa
list2.foldLeft("")((sum,element) => sum + element) // summa
list1.foldLeft(0)((max,element) => if(element > max) element else max ) // max


// flatmap

list1.flatMap( x => List.fill(x)(x))
List.fill(2)(3)
case class Tree(id:Int,val children:List[Tree])
def flatten(t:Tree) : List[Int] = t.id :: t.children.flatMap( x => flatten(x))

flatten(Tree(1,List(
  Tree(2,List(Tree(4,List(Tree(5,Nil),Tree(6,Nil))),
  Tree(3,List(Tree(7,Nil)))
)))))



// Option centralt - Den är en collection - en lista med 0-1 element och har alla ovantstående operationer

Some(23).foreach(println(_))
None.foreach(println(_))
class Patient(val id:Int) { def senasteUppfoljingOpt = Some(3)}

val res = Some(new Patient(23))
// TVINGANDE nullcheck
res.foreach( x => ()) // if(res != null) { ... }
res.filter( x => x.id > 2 ).flatMap( x => x.senasteUppfoljingOpt ).foreach( x => ()) // if(patient && patient.id > 2) { if(x.senatesteUppfoljing != null) { // do stuff } }

val map1 = Map("a" -> 1, "b" -> 2, "c" -> 3)
// Nice to have's
// Group by
val BirdProbe = ".*(Eagle|Falcon|Kite).*".r
List("Golden Eagle", "Bald Eagle", "Prairie Falcon",
  "Peregrine Falcon", "Harpy Eagle", "Red Kite").groupBy { case BirdProbe(typ) => typ }


// Partition
list1.partition( x => x % 2 == 1)





