package oopWithNLayeredApp.entities;

public class Product {
	private int id;
	private String name;
	private double unitPrice;
	
	public Product() {		//right click on the empty line -> Source -> Generate Constructor using Fields... -> Deselect All -> Generate
		
	}
	
	public Product(int id, String name, double unitPrice) {		//right click on the empty line -> Source -> Generate Constructor using Fields... -> Select All -> Generate
		this.id = id;		//you can delete the super code.
		this.name = name;
		this.unitPrice = unitPrice;
	}

	public int getId() {		//right click on the empty line -> Source -> Generate Getters and Setters... -> Select All -> Generate
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
}
