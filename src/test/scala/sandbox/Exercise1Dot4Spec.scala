package sandbox

import cats.instances.string._
import cats.syntax.show._
import org.scalatest.{FlatSpec, Matchers}
import sandbox.Exercise1Dot4.Cat
import sandbox.Exercise1Dot4.ShowInstances._

class Exercise1Dot4Spec extends FlatSpec with Matchers {
  it should "correctly use Int typeclass" in {
    "foo".show shouldEqual "foo"
  }

  it should "correctly use String extension class" in {
    Cat("Black Cat", 30, "white").show shouldEqual "Black Cat is a 30 year-old white cat."
  }
}