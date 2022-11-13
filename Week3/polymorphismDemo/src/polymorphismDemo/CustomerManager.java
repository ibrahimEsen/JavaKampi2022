package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	public void add() {
		System.out.println("Musteri ekleme kodlari calistirildi");
		this.logger.log("Log kodlari calistirildi");
	}

}
