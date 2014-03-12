
// Inheritance & overrides

class Car(var miles:Float,val year:Int) {
  def this(year:Int) = this(0,year)
  def drive(dist:Float) : Float = miles + dist
}

class ColoredCar(_miles:Float,_year:Int, var color:String) extends Car(_miles,_year) {

  println("Now im created")
  def this(year:Int) = this(0,year,"red")
  override def drive(dist:Float) = miles + dist + 0.2f

  def print() : Unit = {
    println("Im a " + color + " car. I was built " + year + " and has run " + miles + " miles")
  }
}

val car1 = new ColoredCar(2001)

car1.print()
car1.drive(10f)
car1.print()


