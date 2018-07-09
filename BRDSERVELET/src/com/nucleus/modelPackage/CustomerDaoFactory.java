package com.nucleus.modelPackage;

public class CustomerDaoFactory {

	public static CustomerClass11Dao getCustomerDao(String implType){
		if(implType.equals("rdbms")){
			return new CustomerClass11DaoRdbms();
		}
		else if(implType.equals("xml")){
			return new CustomerClass11DaoXml(); 
		}
		else 
			return null;
		
	}
}
