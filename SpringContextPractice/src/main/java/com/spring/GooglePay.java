package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GooglePay implements Payment{

	@Autowired
	@Value("${amount}")
	int amount;
	
	
	@Override
	public void pay() {
		
		System.out.println(amount + " is  sucessfully transaferred thruogh Gpay......");
		
		
	}

}
