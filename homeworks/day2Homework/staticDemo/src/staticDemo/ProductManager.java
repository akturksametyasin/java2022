package staticDemo;

public class ProductManager {

	public void add(Product product) {
		
		if(ProductValidator.isValid(product)) {		//when we make a method static, it can be called directly with the class name.
			System.out.println("Ürün eklendi");
		}
		else {
			System.out.println("Ürün bilgileri geçersizdir");
		}
	
		ProductValidator productValidator = new ProductValidator();
		productValidator.bişey();
		
	}
	
}
