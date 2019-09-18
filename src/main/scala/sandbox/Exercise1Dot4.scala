package sandbox

import cats.instances.string._
import cats.instances.int._
import cats.Show
import cats.syntax.show._

object Exercise1Dot4 {
  object ShowInstances {
    implicit val showCat: Show[Cat] = Show.show(value => s"${value.name.show} is a ${value.age.show} year-old ${value.color.show} cat.")
  }

  final case class Cat(name: String, age: Int, color: String)
}