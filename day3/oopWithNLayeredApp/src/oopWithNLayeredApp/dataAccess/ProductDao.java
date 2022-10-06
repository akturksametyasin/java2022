package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public interface ProductDao {		//interface is used in cases where there are alternatives (JDBC and Hibernate)
	void add(Product product);		//interfaces only contain the method signature, ends with a semicolon.
}
