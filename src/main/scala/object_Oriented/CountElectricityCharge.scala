package object_Oriented
import scala.util.Try
case class CountElectricityCharge(accountNumber: Double ,
                                  accountUserName: String ,
                                  address: String ,
                                  previousUnit: Double ,
                                  currentUnit: Double) {

  def countElectricity(): Double={

    val consumedUnits = currentUnit - previousUnit
    if (consumedUnits <= 250) {
      val electricityBill: Double = consumedUnits * 5.25
      electricityBill
    }
    else if (consumedUnits >= 251 && consumedUnits <= 450) {
      val electricityBill: Double = 1312.5 + ((consumedUnits - 250) * 6.75)
      electricityBill
    }
    else {
      val electricityBill: Double = 1312.5 + 1350 + ((consumedUnits - 450) * 8.50)
      electricityBill
    }
  }
  val calculateFinalPayableAmount = {
    try{
      countElectricity +(countElectricity * 0.18)
    }
    catch{
      case _ => println("Something went Wrong")
    }

  }

}
