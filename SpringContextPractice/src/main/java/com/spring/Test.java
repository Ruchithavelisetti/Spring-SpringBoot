package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(Configs.class);
		
		PaymentService ps = container.getBean("pay", PaymentService.class);
		
		ps.test();
		
		
	}

}
