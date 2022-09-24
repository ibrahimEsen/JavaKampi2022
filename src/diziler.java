
public class diziler {

	public static void main(String[] args) {
		
		String [] sehirler1 = new String [] {"Ankara","İstanbul","İzmir"};
		
		for(String sehir : sehirler1) {
			System.out.println(sehir);
		}
		
		for(int i=0; i<3; i++) {
			System.out.println(sehirler1[i]);
		}
	}

}
