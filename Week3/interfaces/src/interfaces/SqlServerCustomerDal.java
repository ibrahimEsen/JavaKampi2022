package interfaces;

public class SqlServerCustomerDal implements ICustomerDal, IRepository {

	@Override
	public void Add() {
		
		System.out.println("Sql Server veritabanina eklendi");
		
	}

}