package sandbox

import org.scalatest.{FlatSpec, Matchers}
import sandbox.Exercise2Utils._

class Exercise2Dot3Spec extends FlatSpec with Matchers {
  import Exercise2Dot3Spec._
  "booleanAndMonoid" should "pass associative law" in {
    import Exercise2Dot3.booleanAndMonoid
    associativeTestCases.map(x => associativeLaw[Boolean](x._1, x._2, x._3)).forall(_ == true)
  }

  it should "pass identity law" in {
    import Exercise2Dot3.booleanAndMonoid
    identityTestCases.map(identityLaw[Boolean]).forall(_ == true)
  }

  "booleanOrMonoid" should "pass associative law" in {
    import Exercise2Dot3.booleanOrMonoid
    associativeTestCases.map(x => associativeLaw[Boolean](x._1, x._2, x._3)).forall(_ == true)
  }

  it should "pass identity law" in {
    import Exercise2Dot3.booleanOrMonoid
    identityTestCases.map(identityLaw[Boolean]).forall(_ == true)
  }

  "booleanXOrMonoid" should "pass associative law" in {
    import Exercise2Dot3.booleanXOrMonoid
    associativeTestCases.map(x => associativeLaw[Boolean](x._1, x._2, x._3)).forall(_ == true)
  }

  it should "pass identity law" in {
    import Exercise2Dot3.booleanXOrMonoid
    identityTestCases.map(identityLaw[Boolean]).forall(_ == true)
  }

  "booleanNotXOrMonoid" should "pass associative law" in {
    import Exercise2Dot3.booleanNotXOrMonoid
    associativeTestCases.map(x => associativeLaw[Boolean](x._1, x._2, x._3)).forall(_ == true)
  }

  it should "pass identity law" in {
    import Exercise2Dot3.booleanNotXOrMonoid
    identityTestCases.map(identityLaw[Boolean]).forall(_ == true)
  }

  object Exercise2Dot3Spec {
    val associativeTestCases: Seq[(Boolean, Boolean, Boolean)] = Seq(
      (true, true, true),
      (true, true, false),
      (true, false, true),
      (true, false, false),
      (false, true, true),
      (false, true, false),
      (false, false, true),
      (false, false, false)
    )

    val identityTestCases: Seq[Boolean] = Seq(true, false)
  }
}