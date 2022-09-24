
public class sartBloklari {

	public static void main(String[] args) {

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
