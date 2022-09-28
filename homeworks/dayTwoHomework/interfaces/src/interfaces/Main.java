package interfaces;

public class Main {

	public static void main(String[] args) {
		
		//ICustomerDal customerDal = new ICustomerDal();		//interface ones cannot be new.
		
		CustomerManager customerManager = new CustomerManager(new SqlServerCustomerDal());
		customerManager.add();
		
	}

}
