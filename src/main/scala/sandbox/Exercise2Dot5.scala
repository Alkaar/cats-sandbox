package sandbox

import cats.Monoid
import cats.instances.double._
import cats.syntax.semigroup._

object Exercise2Dot5 {
  def add[A](items: List[A])(implicit monoid: Monoid[A]): A = items.foldLeft(Monoid[A].empty)(_ |+| _)

  implicit val orderMonoid: Monoid[Order] =
    new Monoid[Order] {
      def combine(a: Order, b: Order) = Order(a.totalCost |+| b.totalCost, a.quantity |+| b.quantity)

      def empty = Order(0, 0)
    }

  case class Order(totalCost: Double, quantity: Double)
}
