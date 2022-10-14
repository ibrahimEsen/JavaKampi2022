public class Main {

	public static void main(String[] args) {

		int [] numbers = new int [] {1,2,5,7,9,0};
		int find = 67;
		boolean isThere = false;
		
		
		for (int number : numbers) {
			if(number==find) {
				isThere=true;
				break;
			}
		}
		
		if(isThere) {
			System.out.println(find + " sayısı mevcuttur");
		} else {
			System.out.println(find + " sayısı mevcut değildir");
		}
		
	}

}