package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Phonepe implements Payment {
	@Autowired
	@Value("${amount}")
	int amount ;
	
	

	@Override
	public void pay() {
		
		
		System.out.println(amount + " is  sucessfully transaferred thruogh Phonepe......");
		
		
	}
	
	
	

}
