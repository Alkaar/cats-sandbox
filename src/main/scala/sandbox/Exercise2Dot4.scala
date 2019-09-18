package sandbox

import cats.{Monoid, Semigroup}

object Exercise2Dot4 {
  implicit def setUnionMonoid[A]: Monoid[Set[A]] =
    new Monoid[Set[A]] {
      def combine(a: Set[A], b: Set[A]) = a union b

      def empty = Set.empty[A]
    }

  implicit def setIntersectSemigroup[A]: Semigroup[Set[A]] =
    new Semigroup[Set[A]] {
      def combine(a: Set[A], b: Set[A]) = a intersect b
    }

  implicit def symmetricDifferenceMonoid[A]: Monoid[Set[A]] =
    new Monoid[Set[A]] {
      def combine(a: Set[A], b: Set[A]): Set[A] = (a diff b) union (b diff a)

      def empty: Set[A] = Set.empty
    }
}
