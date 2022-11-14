public class Main {
//Lesson 8
	public static void main(String[] args) {
		
		int sayi = 5;
		if (sayi<11) {
			
			System.out.println("sayi 11'den KÜÇÜKTÜR");			
		}else if (sayi==11) {
			System.out.println("Sayı 11'e EŞİTTİR");
		}else {
			System.out.println("Sayı 11'den BÜYÜKTÜR");
		}
		
		int not = 51;
		//50 ve üzeri puan ise GEÇTİ
		//40-49 arası ise BÜTÜNLEME
		//0-39 arası ise KALDI
					
		if (not<=39) {
			System.out.println("KALIR");
		} else if (not>=40 && not<50) {
			System.out.println("BÜTÜNLEME");
		} else {
			System.out.println("GEÇER");
		}	

	}

}