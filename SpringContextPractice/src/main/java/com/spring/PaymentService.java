package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("pay")
public class PaymentService {

	
	
	
	@Qualifier("googlePay")
	@Autowired
	Payment payment; // has a 
	
	
	
	
	
	public void test() {
		
		payment.pay();
		
		
	}
	
	
	
	

}
