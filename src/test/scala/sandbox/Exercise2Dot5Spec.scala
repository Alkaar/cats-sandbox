package sandbox

import cats.instances.int._
import cats.instances.option._
import org.scalatest.{FlatSpec, Matchers}
import sandbox.Exercise2Dot5._

class Exercise2Dot5Spec extends FlatSpec with Matchers {

  "add" should "combine Int elements" in {
    add(List(1, 2, 3)) shouldEqual 6
  }

  it should "combine Option[Int] elements" in {
    add(List(Some(1), Some(2), Some(3)): List[Option[Int]]) shouldEqual Some(6)
  }

  it should "combine Order elements" in {
    add(List(Order(2, 3), Order(4, 5))) shouldEqual Order(6, 8)
  }
}