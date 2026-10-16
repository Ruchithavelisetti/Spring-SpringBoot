package com.multipleClasses;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("prototype")
public class Airtel implements Sim{

	@PostConstruct
	public void init() {  // automatically invoked by spring
		
		System.out.println("Data seeding from Airtel ");
	}
	
	
	
	public Airtel() {
		System.out.println("Airtel obj is created");
	}
	
	
	
	@Override
	public void  call() {
		
		System.out.println("Airtel  calling....");
		
	}
	
	
	@PreDestroy
	public void destroy() {
		
		System.out.println("destroyed");
	}

}
