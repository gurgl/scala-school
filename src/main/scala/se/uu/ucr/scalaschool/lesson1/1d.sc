

// Companion objects

class Car(var miles:Float,val year:Int) {}

object Car {

  def printCar(c:Car) : Unit = {
    println("I was built " +  c.year + " and has run " + c.miles + " miles")
  }

}



import Car._

val car1 = new Car(12.3f, 2001)
printCar(car1)

