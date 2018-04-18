import org.scalatest._

class SumOfSinglesSpec extends WordSpec with MustMatchers {

  "sum of singles" +
    "\n step 1 - two distinct " must {

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

    "return 5, when given dupes List(1,1,2,3,4,4)" in {

      SumOfSingles.apply(List(1,1,2,3,4,4)) mustEqual 5
    }

    "return 17, when given dupes list(8,1,2,9,1,3,3,2)" in {

      SumOfSingles.apply(List(8,1,2,9,1,3,3,2)) mustEqual 17
    }
  }

  "step 2 - more that two distinct" must {

    "return 6 with three distinct List(1,2,3)" in {

      SumOfSingles.apply(List(1,2,3)) mustEqual 6
    }
  }

  "return 6 with three distinct and dupes List(1,2,3,4,4)" in {

    SumOfSingles.apply(List(1,2,3,4,4)) mustEqual 6
  }

}
