package com.multipleClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ruchi")
public class SimTest {
	
	@Autowired
	
	Sim sim; // has a  , DMD
	
	@Qualifier("airtel")
	Sim sim2;
	
	
	
	
	
	void test() {
		
		
		sim.call();
		
		
	}
	

	
	
	
	
	
}
