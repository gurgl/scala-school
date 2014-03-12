
// En känd klass. Det dagliga kladdet är bortslimmat så långt det går
class Car(var miles:Float,val year:Int)

// Typ inferens - kompilator kan lista ut a car1's typ
val car1 = new Car(23.4f,2001)

println("Was built " + car1.year + " and has run " + car1.miles + " miles")
car1.miles = 400.1f
println("Was built " + car1.year + " and has run " + car1.miles + " miles")


