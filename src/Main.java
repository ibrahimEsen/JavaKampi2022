import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> sehirler = new ArrayList<String>();
		sehirler.add("Bursa");
		sehirler.add("istanbul");
		sehirler.add("Ankara");

		for (String sehir : sehirler) {
			System.out.println(sehir);
		}

		ArrayList<CreditManager> credits = new ArrayList<CreditManager>();
		credits.add(new MortgageManager());
		credits.add(new VehicleManager());
		credits.add(new OfficerCredit());

		for (CreditManager credit : credits) {
			credit.calculate();
			credit.add();

		}
	}
}
