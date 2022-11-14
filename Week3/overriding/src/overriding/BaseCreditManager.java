package overriding;

public class BaseCreditManager {
			
	public /*final*/ double calculate(double amount) {
		return amount*1.18;
	}
	//Bu mirasci siniftaki operasyonun/metodun varisci siniflar/classlar tarafindan override edilmesini istemiyorsak final isareti eklenmeli
}
