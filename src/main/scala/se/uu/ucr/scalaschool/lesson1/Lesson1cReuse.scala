package se.uu.ucr.scalaschool.lesson1

/**
 * Created with IntelliJ IDEA.
 * User: karlw
 * Date: 2014-03-11
 * Time: 19:53
 * To change this template use File | Settings | File Templates.
 */
class Lesson1cReuse {

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

}
