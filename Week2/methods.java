public class Main {
//Lesson 24
	public static void main(String[] args) {
		sayiBul();
		sayiBul();
	}

	public static void sayiBul() {

		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int find = 2;
		boolean isThere = false;

		for (int number : numbers) {
			if (number == find) {
				isThere = true;
				break;
			}
		}

		String textMessage = "";
		if (isThere) {
			textMessage = find + " sayısı listede mevcuttur";
			outMessage(textMessage);
		} else {
			textMessage = find + " sayısı listede mevcut değildir";
			outMessage(textMessage);
		}
	}

	public static void outMessage(String mesaj) {
		System.out.println(mesaj);
	}
}