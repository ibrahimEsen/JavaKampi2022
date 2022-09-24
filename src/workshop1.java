
public class workshop1 {

	public static void main(String[] args) {
		
		int[] sayilar = new int[] {1,2,3,4,5,6,7,8,9,10};
		int aranan = 3;
		
		boolean varMi = sayiBul(sayilar, aranan);
		mesajVer(varMi, aranan);
		
	}
	
	public static void mesajVer(boolean varMi, int aranan) {
		
		String mesaj = "";
		
		if (varMi == true) {
			mesaj = "Aranan " + aranan +" sayısı dizide VAR.";
			System.out.println(mesaj);
		} else {
			mesaj = ("Aranan " + aranan +" sayısı dizide YOK.");
			System.out.println(mesaj);
		}
	}
	
	public static boolean sayiBul(int[] sayilar, int aranan) {
		
		boolean varMi = false;
		
		for(int sayi : sayilar) {
			if (sayi == aranan) {
				varMi = true;
				break;
			}
		}
		
		return varMi;
	}

}

//Bir foksiyon yaz - bool döndür. sayiBul
//İki Parametre alsın. P1:dizi P3:3
//3 sayısı dizide vardır/yoktur ifadesi göster

//Single responsibility