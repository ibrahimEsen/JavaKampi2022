package overriding;

public class UniCreditManager extends BaseCreditManager {
	public double calculate(double amount) {
		return amount*1.10;
	}
}
