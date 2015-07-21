package com.bankexample;

public class CheckingAccout {
	
	private String AcctNo;

	public String getAcctNo() {
		return AcctNo;
	}

	public void setAcctNo(String acctNo) {
		AcctNo = acctNo;
	}
	
	Person p = new Person();
	

	public boolean validate()
	{
		if(p.getAcctNo()==this.getAcctNo())
		{
			
		}
		return false;
	}
	
	public boolean validateDeposit( int amt)
	{
		
	return false;	
	}
	

	

}
