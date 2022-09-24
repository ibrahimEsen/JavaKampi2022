public class metotlar {

	public static void main(String[] args) {
		
		int krediMiktari = 100000;
		double krediFaizi = 0.27;
		String musteriAdi = "Elif";
		String musteriSoyadi = "Tekin";
		String sistemMesaji = krediMiktari+" TL tutarındaki krediye karşılık toplam geri ödenecek tutar : "+krediHesapla(krediMiktari, krediFaizi);
				
		mesajVer1(musteriAdi, musteriSoyadi);
		mesajVer2(sistemMesaji);
		hesapla();
		System.out.println("-----------");
		
		
		toplamYuzdesi(150, 200);
		System.out.println(topla(11, 23));
		System.out.println(toplamYuzdesi(10, 90));
		System.out.println(krediHesapla(krediMiktari, krediFaizi));
		
	}
	
	public static void mesajVer1(String isim, String soyisim) {
		System.out.println("Merhaba "+isim+" "+soyisim);
	}
	
	public static void mesajVer2(String mesaj) {
		System.out.println(mesaj);
	}
	
	public static void hesapla() {
		System.out.println("Hesaplandı");
	}
	
	public static int topla(int sayi1, int sayi2) {
		int toplam = sayi1 + sayi2;
		return toplam;
	}
	
	public static double toplamYuzdesi(int sayi1, int sayi2) {
		int toplam = topla(sayi1, sayi2);
		double sonuc = toplam * 0.1;
		return sonuc;
	}
	
	public static double krediHesapla(int krediMiktari, double krediFaizi) {
		
		double toplamKrediTutari = krediMiktari*(1+krediFaizi);
		return(toplamKrediTutari);
	}

}
