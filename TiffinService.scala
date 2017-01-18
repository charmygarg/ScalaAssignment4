class Tiffin { 
	var pay = 1000
  def payment(str:String) = str match{
	case ("Patym" | "FreeCharge")  =>
		println(pay + ((pay * 2) / 100)
	case "NetBanking"  =>
		println(pay + 5)
	case "CardPayment"  =>
		println(pay + 1.5)
	case "Cash"  =>
		println("No extra Cost")
	case _ =>
		println("Please choose payment mode")
	}
		
} 
object TiffinService extends App { 
	val tiffin = new Tiffin() 
	val choice = tiffin.payment("CardPayment"); 
	
}

