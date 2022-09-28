package interfaces;

public class OracleCustomerDal implements ICustomerDal {		//OracleCustomerDal applies ICustomerDal

	@Override
	public void Add() {
		System.out.println("Oracle eklendi");
	}

}
