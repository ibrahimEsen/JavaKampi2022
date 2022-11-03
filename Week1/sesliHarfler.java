public class Main {
//Lesson 20
	public static void main(String[] args) {
		
		char harf = 'A';
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(harf + " harfi kalın sesli harftir");
			break;
			default:
				System.out.println(harf + " harfi ince sesli harftir");		
		}
	}
}
