
// Alla statements har typ och resultat
val res1 = for ( a <- Array(1,2)) { }
val res2 = if(1 > 2) "a" else "b"
val res3 = {
  val s = {
    {
      1.2 * 2f
    } * 3d
  }
  (x:Int) => x * x * s
}

println(res1)
println(res2)
println(res3)


