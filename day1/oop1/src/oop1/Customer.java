package oop1;

public class Customer {
	
	private int id;		//the same type properties of IndividualCustomer and CoporateCustomer are written in Customer.
	private String customerNumber;
	private String phone;

	public int getId() {		//on the empty line -> right click -> Source -> Generate Getters and Setters... -> Select All -> Generate
		return id;		//if you want you can format your codes. (empty line -> right click -> Source -> Format) (ctrl + shift + f)
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
