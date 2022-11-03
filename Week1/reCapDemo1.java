public class Main {

	public static void main(String[] args) {

		int referansSayi = 20;
		int sayi1 = 35;
		int sayi2 = 23;
		int enBuyuk = referansSayi;
		
		if (enBuyuk<sayi1) {
			enBuyuk=sayi1;
			
		}
		
		if (enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		
		System.out.println("En büyük sayı : " + enBuyuk);

	}

}
