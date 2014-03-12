
// Constructors

class Car(var miles:Float,val year:Int) {
  def this(year:Int) = this(0,year)
  def drive(dist:Float) : Float = miles + dist
}

val car1 = new Car(2001)

println("Was built " + car1.year + " and has run " + car1.miles + " miles")