public class Main {
	//Lesson 6
	public static void main(String[] args) {

		int toplamTutar = 50000;
		double faizOrani = 23.2;
		boolean durum = true;
		String baslik = "Kredi hesabi tamamlandi";

		System.out.println(baslik);
		System.out.println();
		System.out.println("---------------------");
		System.out.println();
		System.out.println("Talep edilen kredi tutarı : " + toplamTutar);
		System.out.println("Faiz oranı : % " + faizOrani);
		System.out.println();
		System.out.println("Toplam geri ödeme tutarı : " + toplamTutar*(1+faizOrani/100));
		
	}
}