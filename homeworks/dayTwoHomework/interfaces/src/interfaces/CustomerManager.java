package interfaces;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		//the business layer is where business codes are written.
		customerDal.Add();
	}
	
}
