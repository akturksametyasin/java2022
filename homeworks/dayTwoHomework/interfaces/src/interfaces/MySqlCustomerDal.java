package interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository {		//Dal : data access layer	,	MySqlCustomerDal applies ICustomerDal
		//classes can implement multiple interfaces.		//syntax -> public class MySqlCustomerDal extends OracleCustomerDal implements ICustomerDal, IRepository
	@Override
	public void Add() {
		System.out.println("My sql eklendi");
	}		

}
