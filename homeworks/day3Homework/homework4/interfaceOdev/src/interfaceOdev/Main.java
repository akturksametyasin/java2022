package interfaceOdev;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager(new İkinciMevzuat());
		customerManager.add();
	}

}