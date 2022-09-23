package oop1;

public class Product {		//class'es are named as PascalCase.
					//class; it holds the information of an object. public; opens out access.
					//we do not define the product here, we prepare the environment that can define the product.
					//there are two types of classes: property holder and operation holder.
				
	private String name;		//variables are named as camelCase.
	private double unitPrice;
	private double discount;		//private is wroten as prefixed for getter and setter.
	private String imageUrl;		//private means it can only be used inside that class.
	private int unitsInStock;		//These are called as fields.(class's field)
	
	public String getName() {		//on the empty line -> right click -> Source -> Generate Getters and Setters... -> Select All -> Generate
		return name;		//if you want you can format your codes. (empty line -> right click -> Source -> Format) (ctrl + shift + f)
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
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {		//if we want it not to be setter and we want it to be getter, we delete the set code block or exact opposite.
		this.discount = discount;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	
	
}
