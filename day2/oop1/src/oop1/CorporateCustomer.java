package oop1;

public class CorporateCustomer extends Customer {

	private String companyName;		//special properties are written for CorporateCustomer.
	private String taxNumber;

	public String getCompanyName() {		//on the empty line -> right click -> Source -> Generate Getters and Setters... -> Select All -> Generate
		return companyName;		//if you want you can format your codes. (empty line -> right click -> Source -> Format) (ctrl + shift + f)
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	
}
