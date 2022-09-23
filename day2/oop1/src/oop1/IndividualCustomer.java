package oop1;

public class IndividualCustomer extends Customer{		//IndividualCustomer is an extention of Customer. Or IndividualCustomer is a Customer. So Customer is a general set and IndividualCustomer is included in Customer.

	private String firstName;		//special properties are written for IndividualCustomer.
	private String lastName;

	public String getFirstName() {		//on the empty line -> right click -> Source -> Generate Getters and Setters... -> Select All -> Generate
		return firstName;		//if you want you can format your codes. (empty line -> right click -> Source -> Format) (ctrl + shift + f)
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
	
}
