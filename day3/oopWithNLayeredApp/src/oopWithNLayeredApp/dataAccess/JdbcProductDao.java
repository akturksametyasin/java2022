package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {		//Dao : data access object
	public void add(Product product) {
		//just only db access codes are written here... SQL
		System.out.println("JDBC ile veritabanına eklendi.");
	}
}