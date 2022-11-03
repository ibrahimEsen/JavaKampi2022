package classes;

public class Main {
//Lesson 27-28-29
	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Update();
		customerManager.Remove();
	}

}
