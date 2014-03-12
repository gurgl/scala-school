
// Apply / unapply
object Even {
  def apply(in:Int) = in * 2
  def unapply(out:Int) = if(out % 2 == 0) Some(out / 2) else None
}

Even.apply(2)
Even(2)

// Inget normalt användninsfall - men för illustration
val Even(a) = 4

try { val Even(b) = 3 } catch { case _: Throwable => "detta gick inte" }
