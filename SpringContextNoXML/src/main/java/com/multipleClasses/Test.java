package com.multipleClasses;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.Configs;

public class Test {
	public static void main(String[] args) {
		
		
	ApplicationContext container = new AnnotationConfigApplicationContext(Configs.class);
		
	SimTest simTest	 = container.getBean("ruchi", SimTest.class);
		
		
		simTest.test();
		
		System.out.println("=================");
		
		
		
		
		Airtel airtel = container.getBean("airtel",Airtel.class );
		
		Airtel airtel2 = container.getBean("airtel",Airtel.class );
		
		System.out.println(airtel);
		System.out.println(airtel2);
		
		
		
	}

}
