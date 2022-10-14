package recapDemo2;

public class Main {

	public static void main(String[] args) {
		
		double [] myList = {1,2,3,41.3,5,6};
		double toplam = 0;
		double enBuyuk = myList[0];
		
		for (double sayi : myList) {
			if (enBuyuk<sayi) {
				enBuyuk = sayi;
			}
			toplam = toplam + sayi;
			System.out.println(sayi);
		}
		
		System.out.println("Toplam : " + toplam);	
		System.out.println("En büyük sayı : " + enBuyuk);
	}

}
