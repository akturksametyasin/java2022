package staticDemo;

public class ProductValidator {		//when we make a method static, it can be called directly with the class name.

	static {		//static constructor blocks don't need to do new to run.
		System.out.println("Static yapıcı blok çalıştı");
	}
	
	public ProductValidator() {		//constructor blocks need to do new to run.
		System.out.println("Yapıcı blok çalıştı");
	}
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {		//isEmpty = not have any value	,	! = not
			return true;
		}
		else {
			return false;
		}
	}
	
	public void bişey() {		//we need to do new the ProductValidator because it is not static for us to run this line.
		
	}
	
	public static class BaskaBirClass {		//inner class
		
		public static void sil() {
			
		}
		
	}
	
}
