public class Main {
//Lesson 25
	public static void main(String[] args) {

		String mesaj = "Bu bir mesajdır";
		String yeniMesaj = sehir();
		System.out.println(yeniMesaj);
		int sayi = topla(5, 7);
		System.out.println(sayi);
		int toplam = topla2(2, 6, 59, 3, 100);
		System.out.println(toplam);
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

	public static String sehir() {
		return "Ankara";
	}

}
