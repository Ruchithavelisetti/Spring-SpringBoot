package com.multipleClasses;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public  class Jio  implements Sim{

	@Override
	public void  call() {
   System.out.println("jio calling....");
		
	}
	
	
	
	
	
	
	
	
	
	

}
