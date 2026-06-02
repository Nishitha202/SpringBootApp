package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    OperatingSystem op;

  
    
//	public Laptop(OperatingSystem op) {
//		super();
//		this.op = op;
//	}
    
	

    @Autowired
	public void setOp(OperatingSystem op) {
		this.op = op;
	}
    public OperatingSystem getOp() {
		return op;
	}
    
    public void UseLaptop() {
    	System.out.println("Turning on Laptop....");
    	op.operating();
    }


	
   
}
