package com.springautowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "fb")
public class FlightBookingService {
	@Autowired
private PersonService pService; 
	@Autowired
private AirlineService aService;




public String bookFlight(String userName,String airlineName){
	if(pService.isPersonAcceptable(userName)){
		String flight = aService.getAvailableFlight(airlineName);
		System.out.println(userName+","+flight);
		return "success";
	}
	return "failed";
}
}
