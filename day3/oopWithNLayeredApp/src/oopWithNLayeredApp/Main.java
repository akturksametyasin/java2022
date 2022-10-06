package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {
	
	//codes are divided into 3 basic parts: Data Access, Business, UI
	//Data Access methods : JDBC, Hibernate-ORM, JPA
	//package names samples : oopWithNLayeredApp.business, oopWithNLayeredApp.dataAccess
	//left click on the oopWithNLayeredApp package and go to three dot at top right on the left tab, -> Package Presentation -> Hierarchial
	
	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "IPhone Xr", 10000);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};		//if logging is not desired, it also works by deleting the contents.
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);
		
	}

}