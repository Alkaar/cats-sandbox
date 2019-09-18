package sandbox

import cats.instances.option._
import cats.syntax.eq._
import org.scalatest.{FlatSpec, Matchers}
import sandbox.Exercise1Dot5.Cat
import sandbox.Exercise1Dot5.EqInstances.catEq

class Exercise1Dot5Spec extends FlatSpec with Matchers {
  import Exercise1Dot5Spec._

  it should "correctly compare two Cat instances" in {
    val convertToEqualizer = ()
    cat1 === cat2
    cat1 =!= cat2
    convertToEqualizer
  }

  it should "correctly compare two Option[Cat] instances" in {
    val convertToEqualizer = ()
    optionCat1 === optionCat2
    optionCat1 =!= optionCat2
    convertToEqualizer
  }

  object Exercise1Dot5Spec {
    val cat1 = Cat("Garfield",   38, "orange and black")
    val cat2 = Cat("Heathcliff", 33, "orange and black")

    val optionCat1 = Option(cat1)
    val optionCat2 = Option.empty[Cat]
  }
}