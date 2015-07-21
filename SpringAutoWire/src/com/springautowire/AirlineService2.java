package com.springautowire;
import org.springframework.stereotype.Service;

@Service
public class AirlineService2 implements AirlineService {
    @Override
	public String getAvailableFlight(String airlineName){
		return "Emirates-67";
	}
}
