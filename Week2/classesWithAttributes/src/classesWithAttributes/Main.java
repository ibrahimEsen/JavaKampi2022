package classesWithAttributes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product();
		product.name = "Laptop";
		product.id = 1;
		product.description = "HP Ideapad 3";
		product.price = 7300;
		product.stockAmount = 7;

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

	}

}
