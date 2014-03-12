
// Funktioner

def f1(a:Int) : String = (a * 2).toString
def f2(a:Int) = (a * 2).toString

// I scala är funktioner object.
//
// Från wiki:
//
// In computer science, a programming language is said to have "first-class" functions if it treats functions as
// first-class citizens. Specifically, this means the language supports passing functions as arguments to other functions,
// returning them as the values from other functions, and assigning them to variables or storing them in data structures.[1]

val f3 = (a:Int) => (a * 2).toString
val f4:Function[Int,String] = (a:Int) => (a * 2).toString

println(f1(3) + " = " + f2(3) + " = " + f3(3) + " = " + f4(3))

// def's = metoder,

println(f3.apply(3))
println((f1 _).apply(3))


def g(i:Int => String) : Int => Float = {
  (x:Int) => i(x).toFloat * 5
}

println(g(f3)(3))

// void

def inget1() : Unit = ()
def inget2() = ()
def inget3() = ()

