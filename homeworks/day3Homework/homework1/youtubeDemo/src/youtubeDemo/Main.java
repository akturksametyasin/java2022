package youtubeDemo;

public class Main {

	public static void main(String[] args) {
		/*
		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.calculate();
		creditManager.save();
		
		Customer customer = new Customer();		//instance creation
		customer.id = 1;
		customer.city = "Ankara";

		
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.save();
		customerManager.delete();
		
		Company company = new Company();
		company.taxNumber = "10000";
		company.companyName = "Arçelik";
		company.id = 100;
		
		CustomerManager customerManager2 = new CustomerManager(new Person());
		
		Person person = new Person();
		person.firstName = "Engin";
		person.lastName = "Demiroğ";
		
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();
		*/
		
		//IoC Conteiner
		CustomerManager customerManager3 = new CustomerManager(new Customer(), new CarCreditManager());
		customerManager3.giveCredit();
	}

}
