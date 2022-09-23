package oop1;		//oop: object oriented programming (nesne güdümlü (yönelimli) programlama)

public class Main {

	public static void main(String[] args) {

		//String message = "Vade oranı";		//String: data type , message: name
		
		Product product1 = new Product();		//this is how the class variable is created. product: data type , product1: name
		product1.setName("Delongi Kahve Makinesi");		//set the Name of product1 to "Delongi Kahve Makinesi".
		product1.setDiscount(7);		//these command lines are called set value. assigning value -> set
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");

		//System.out.println(product1.name);		//this command line is called get value. reading value -> get
		
		Product product2 = new Product();		//we created the objects that contains many things in it.
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(8);
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(2);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(9);
		product3.setUnitPrice(4500);
		product3.setUnitsInStock(4);
		product3.setImageUrl("image2.jpg");		//we don't write this data like this, data comes from data source (from data base).
		
		
		Product[] products = {product1,product2,product3};		//keep products1, products2, products3 in the variable named as products in the Product data type.
		
		
		for (Product product : products) {		//type for, press ctrl+space and select foreach in the snippets. foreach: by visiting the products one by one, assign the elements to the product variable, respectively.
			System.out.println(product.getName());		//reading value -> get
		}
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("052222222222");
		individualCustomer.setCustomerNumber("54651234565456");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroğ");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("0533333333");
		corporateCustomer.setTaxNumber("111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer,corporateCustomer};		//keep individualCustomer,corporateCustomer in the variable named as customers in the Customer data type.
				//the code didn't give an error because we wrote it as (public class IndividualCustomer extends Customer) in the IndividualCustomer.java.
		
	}

}
