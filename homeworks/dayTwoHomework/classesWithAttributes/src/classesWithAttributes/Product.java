package classesWithAttributes;

public class Product {
	
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {		// constructor without parameters
		System.out.println("Yapıcı blok çalıştı.");
		this.id = id;		//if we don't write these codes, it give error because of there is no name value.
		this.renk = renk;
		this.name = name;
		this.price = price;
		this.description = description;
		this.stockAmount = stockAmount;
	}
	
	public Product(){		//overloading - we can use methods with the same name but different parameters.
	
	}
	
	// attribute | field
	private int id;		//normally, there is a public in front of it and it is okay if we don't write it. if we write private: public: halka açık , private: sadece tanımlandığı blokta geçerlidir.
	private String name;		//if we write private: valid only in the block in which it is defined.
	private String description;		// public and private are (encapsulations)
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	//get: reading a value , set: assigning a value
	//because of we made it private, we want to access them from another place. and here we generate getters and setters.
	//right click on an empty line -> source -> generate getters and setters -> select all -> generate
	public int getId(){		//if we just write (get), it can be read only. if we just write (set), it can be write only. or we can write both of them.
		return id;
	}
	public void setId(int id){		
		this.id = id;		// (this) means the class I'm in. _ prefix can be added to the above variables to avoid confusion.
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getKod() {
		return this.name.substring(0,1) + id;		//getKod displays what comes after the return command when read.	
	}
	//if we don't want the code variable to be set, if we just want it to be read, the setter is deleted.
}
