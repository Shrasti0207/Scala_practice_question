import object_Oriented.CountElectricityCharge
import org.scalatest.funsuite.AnyFunSuite
class CountElectricityChargeTest extends AnyFunSuite{
  test("Test electricity bill calculation") {
    val testInputs = CountElectricityCharge(1001, "user1", "Delhi", 5062, 5904)
    assert(testInputs.countElectricity === 5994.5)
  }
  test("Test electricity bill calculation with gst") {
    val testInputs = CountElectricityCharge(1001, "user1", "Delhi", 5062, 5904)
    assert(testInputs.calculateFinalPayableAmount=== 7073.51)
  }
  test("Test electricity bill calculation should be zero on zero electricity consumption") {
    val testInputs = CountElectricityCharge(0, "user1", "Delhi", 0, 0)
    assert(testInputs.calculateFinalPayableAmount === 0)
  }

}
