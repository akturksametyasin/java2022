package oopWithNLayeredAppKodlamaIO.entities;

public class BaseEntity {

	private String id;
	private String name;
	
	public BaseEntity() {
		super();
	}

	public BaseEntity(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
