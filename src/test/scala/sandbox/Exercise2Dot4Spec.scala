package sandbox

import org.scalatest.{FlatSpec, Matchers}
import sandbox.Exercise2Utils._

class Exercise2Dot4Spec extends FlatSpec with Matchers {
  import Exercise2Dot4Spec._

  "setUnionMonoid" should "pass associative law" in {
    import Exercise2Dot4.setUnionMonoid
    associativeTestCases.map(x => associativeLaw[Set[Int]](x._1, x._2, x._3)).forall(_ == true)
  }

  it should "pass identity law" in {
    import Exercise2Dot4.setUnionMonoid
    identityTestCases.map(identityLaw[Set[Int]]).forall(_ == true)
  }

  "setIntersectMonoid" should "pass associative law" in {
    import Exercise2Dot4.setIntersectSemigroup
    associativeTestCases.map(x => associativeLaw[Set[Int]](x._1, x._2, x._3)).forall(_ == true)
  }

  "symmetricDifferenceMonoid" should "pass associative law" in {
    import Exercise2Dot4.symmetricDifferenceMonoid
    associativeTestCases.map(x => associativeLaw[Set[Int]](x._1, x._2, x._3)).forall(_ == true)
  }

  it should "pass identity law" in {
    import Exercise2Dot4.symmetricDifferenceMonoid
    identityTestCases.map(identityLaw[Set[Int]]).forall(_ == true)
  }

  object Exercise2Dot4Spec {
    val associativeTestCases: Seq[(Set[Int], Set[Int], Set[Int])] = Seq(
      (Set.empty, Set.empty, Set.empty),
      (Set.empty, Set.empty, Set(1)),
      (Set.empty, Set(1), Set.empty),
      (Set(1), Set.empty, Set.empty),
      (Set(1), Set(2), Set(3)),
      (Set(1, 2), Set(3, 4), Set(5, 6)),
      (Set(1, 2), Set(2, 3), Set(4, 5))
    )

    val identityTestCases: Seq[Set[Int]] = Seq(Set.empty, Set(1), Set(2), Set(1, 2))
  }
}