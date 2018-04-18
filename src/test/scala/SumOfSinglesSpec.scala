import org.scalatest._

class SumOfSinglesSpec extends WordSpec with MustMatchers {

  "sum of singles" must {

    "return exception when given an empty list" in {
      val Ex = intercept[Exception](SumOfSingles.apply(List()))

      Ex.getMessage mustEqual "invalid input"
    }

    "return exception when given a list with only 1 value" in {
      val Ex = intercept[Exception](SumOfSingles.apply(List(1)))

      Ex.getMessage mustEqual "invalid input"
    }

    "return 3 when given List(1,2)" in {

      SumOfSingles.apply(List(1,2)) mustEqual 3
    }

    "return 5 when given List(3,2)" in {

      SumOfSingles.apply(List(3,2)) mustEqual 5
    }

    "retrun 3 when given list containing dupes List(1,2,3,3)" in {

      SumOfSingles.apply(List(1,2,3,3)) mustEqual 3
    }

  }

}
