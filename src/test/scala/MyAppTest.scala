import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.must.Matchers

/** Test our Stack implementation in Spec style. */
class MyAppTest extends AnyFunSpec with Matchers {
//value based
  describe("Main.sum") {
    it("must add two numbers together") {
      val result = MyApp.sum(2, 2)
      // assertResult(4, result)
      result mustBe 4
    }
  }

}