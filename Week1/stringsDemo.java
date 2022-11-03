public class Main {
//Lesson 17-18
	public static void main(String[] args) {
		
		String mesaj = "-Bu bir mesajdır- ";
		
		int arananElemanSirasi = 5;
		int arananElemanIndexi = arananElemanSirasi-1;
		String ilkKarakter = "-";
		String sonKarakter = "-";
		
		System.out.println(mesaj.concat(" ifadesinde ki toplam eleman sayısı ve " + arananElemanSirasi + ". sıradaki harf bilgisi aşağıda sunulmuştur."));
		System.out.println("---");
		System.out.println("Eleman sayısı : " + mesaj.length());
		System.out.println(arananElemanSirasi + ". eleman : " + mesaj.charAt(arananElemanIndexi));
		System.out.println(mesaj.startsWith(ilkKarakter));
		System.out.println(mesaj.endsWith(sonKarakter));
		System.out.println(mesaj.indexOf('a'));
		
		String yeniMesaj = mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(5));
		System.out.println(mesaj.substring(5,9));
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());	
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
	}

}