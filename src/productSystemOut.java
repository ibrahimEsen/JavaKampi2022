
public class productSystemOut {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 3 };

		Product product1 = new Product();
		product1.setName("Laptop");

		Product product2 = new Product();
		product2.setName("Klavye");

		Product[] urunler = new Product[] { product1, product2 };

		for (int i = 0; i < urunler.length; i++) {
			System.out.println("Ürün adı : " + urunler[i].getName());
		}

	}

}
