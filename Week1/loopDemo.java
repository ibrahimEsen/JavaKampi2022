public class Main {
//Lesson 11-12-13
	public static void main(String[] args) {

		// for
		for (int i = 2; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For döngüsü tamamlandı");

		// while.
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("While döngüsü tamamlandı");

		// Do while
		int j = 1;
		do {
			System.out.println(j);
			j += 3;
		} while (j < 10);
		System.out.println("Do-while döngüsü tamamlandı");
	}

}