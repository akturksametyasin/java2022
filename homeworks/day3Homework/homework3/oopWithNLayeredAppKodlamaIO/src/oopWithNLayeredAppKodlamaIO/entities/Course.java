package oopWithNLayeredAppKodlamaIO.entities;

public class Course extends BaseEntity {
	
	private String image;
	private String description;
	private double price;
	
	public Course() {
		
	}

	public Course(String id, String name, String image, String description, double price) {
		this.setId(id);
		this.setName(name);
		this.image = image;
		this.description = description;
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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
	
}
