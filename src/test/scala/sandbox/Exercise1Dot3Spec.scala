package sandbox

import org.scalatest.{FlatSpec, Matchers}
import sandbox.Exercise1Dot3.PrintableInstances._
import sandbox.Exercise1Dot3.PrintableSyntax._
import sandbox.Exercise1Dot3.{Cat, Printable}

class Exercise1Dot3Spec extends FlatSpec with Matchers {
  it should "correctly use Int typeclass" in {
    Printable.fmt(1) shouldEqual "1"
    Printable.print(1)
  }

  it should "correctly use String typeclass" in {
    Printable.fmt("foo") shouldEqual "foo"
    Printable.print("foo")
  }

  it should "correctly use Cat typeclass" in {
    Printable.fmt(Cat("Black Cat", 30, "white")) shouldEqual "Black Cat is a 30 year-old white cat."
    Printable.print(Cat("Black Cat", 30, "white"))
  }

  it should "correctly use Int extension class" in {
    1.fmt shouldEqual "1"
    1.print
  }

  it should "correctly use String extension class" in {
    "foo".fmt shouldEqual "foo"
    "foo".print
  }

  it should "correctly use Cat extension class" in {
    Cat("Black Cat", 30, "white").fmt shouldEqual "Black Cat is a 30 year-old white cat."
    Cat("Black Cat", 30, "white").print
  }
}