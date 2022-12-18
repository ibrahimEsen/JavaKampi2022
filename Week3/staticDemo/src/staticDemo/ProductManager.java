package staticDemo;

public class ProductManager {
	
	public void add(Product product) {
		
		//ProductValidator productValidator = new ProductValidator();
		if(ProductValidator.isValid(product)) {
			System.out.println("Urun eklendi");
		}else {
			System.out.println("Ekleme basarisiz");
		}
		
		
	}

}
