package com.advance.spring;

public class PersonService {

	private CreditCardService cservice; // = new CreditCardService();
	
	
	public CreditCardService getCservice() {
		return cservice;
	}

	public void setCservice(CreditCardService cservice) {
		this.cservice = cservice;
	}

	public String getPersonFullName(String userName)
	{
		return "Balakrishna";
	}
	
	public boolean isPersonAcceptable(String userName)
	{
		return cservice.isCreditCardBalanceAvailable(userName);
	}
}
