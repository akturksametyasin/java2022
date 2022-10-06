package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	//when a layer is using another layer's class, it should only access its interface.
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {		//right click on the empty line -> Source -> Generate Constructor using Fields... -> Select productDao -> Generate
		this.productDao = productDao;
		this.loggers = loggers;
	}
	
	public void add(Product product) throws Exception {		//it may throw an error when you call this method.
		//business rules
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz");		//throws error and stops working
		}
		
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
		
	}
}
