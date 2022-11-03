package classesWithAttributes;

public class Main {
//Lesson 31-32-33-34
	public static void main(String[] args) {

		Product product = new Product();
		product.set_name("Laptop");
		product.set_id(1);
		product.set_description("HP Ideapad 33");
		product.set_price(7300);
		product.set_stockAmount(7);
		
		Product product2 = new Product(131, "Laptop", "HP G257", 3450, 5, "Siyah");

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		productManager.Add(product2);		
		System.out.println(product.getKod());

	}

}
