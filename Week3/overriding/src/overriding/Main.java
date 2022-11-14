package overriding;

public class Main {

	public static void main(String[] args) {
		//-------------------
		EduCreditManager eduCreditManager= new EduCreditManager();
		double req = 1000;
		double a = eduCreditManager.calculate(req);
		System.out.println("Talep edilen kredi tutari = "+ req);
		System.out.println("Kredi faizi = "+ (a-req));
		System.out.println("Toplam geri odeme tutari = "+ a);
		//------------------
		
		BaseCreditManager[] creditManagers= new BaseCreditManager[] {new EduCreditManager(),new AgroCreditManager(), new UniCreditManager()};
		for (BaseCreditManager creditManager : creditManagers) {
			double req1 = 1000;
			double a1 = creditManager.calculate(req1);
			System.out.println("----------------------------------");
			System.out.println("Talep edilen kredi tutari = "+ req1);
			System.out.println("Kredi faizi = "+ (a1-req1));
			System.out.println("Toplam geri odeme tutari = "+ a1);

		}
		

	}

}
