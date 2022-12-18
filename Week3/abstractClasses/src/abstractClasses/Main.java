package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		KidsGameCalculator kidsGameCalculator = new KidsGameCalculator();
		kidsGameCalculator.calculate();
		kidsGameCalculator.gameOver();
		
		GameCalculator gameCalculator = new ManGameCalculator();
	}

}
