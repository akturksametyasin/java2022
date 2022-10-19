package oopWithNLayeredAppKodlamaIO.entities;

public class Instructor extends BaseEntity {
	
	private String firstName;
	private String lastName;
	private String image;

	public Instructor() {
		
	}

	public Instructor(String id, String firstName, String lastName, String image) {
		this.setId(id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.image = image;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
}
