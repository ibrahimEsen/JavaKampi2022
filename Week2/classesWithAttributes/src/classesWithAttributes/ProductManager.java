package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		// JDBC kodları ile veritabanına ekleme
		System.out.println("Ürün eklendi : " + product.get_name() + " - " + product.get_description());
	}
	
	
}
