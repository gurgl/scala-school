
class Car(var miles:Float,val year:Int)

// TRAITS

// Plain old interface

trait HasDragonEvaluator {
  def isDragonish:Boolean
}

// With field requirement!

trait HasYearAttribute {
  val year:Int
}

// Interface AND implemenentation

trait HasHorn {
  def pressHorn = println("Honk Honk")
}

// EXAMPLES

class CarWithHorn(m:Float,y:Int) extends Car(m,y) with HasHorn
class SomethingWithHorn() extends HasHorn


new Car(2f,2) with HasYearAttribute

new Car(2f,2) with HasDragonEvaluator {
  def isDragonish = miles / 12 == 3
}


(new Car(1f,2001) with HasHorn).pressHorn

(new CarWithHorn(1f,2001)).pressHorn

(new SomethingWithHorn).pressHorn

// Advanced: Targeted traits

trait HasCarInsurance {
  self:Car =>
  def isCovered(year:Int) = year - self.year < 5
}

class NotACar extends HasCarInsurance {} // Doesnt compile




println (
  "is covered" + (new Car(10f,1999) with HasCarInsurance).isCovered(2001)
)

new Car(10f,1999) with HasCarInsurance with HasHorn




