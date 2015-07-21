package com.advance.spring;

public class FlightBookingService {

	private PersonService pservice; //=new PersonService();
	private AirLineService aservice; // = new AirLineService();
	
	
	
	
	
	public PersonService getPservice() {
		return pservice;
	}

	public void setPservice(PersonService pservice) {
		this.pservice = pservice;
	}
	
	public AirLineService getAservice() {
		return aservice;
	}


	public void setAservice(AirLineService aservice) {
		this.aservice = aservice;
	}



	public String bookFlight(String userName,String airlineName)
	{
		//Check USer Credid Card Balance
		
		if(pservice.isPersonAcceptable(userName)){
			
		String flight=aservice.getAvailableFlight(airlineName);
		System.out.println("Now Booking Flight For the User "+userName+ "with Flight "+flight);
		
		return "success";
		}
		return "Failed";
	
}
}
