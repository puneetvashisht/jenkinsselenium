package com.ust.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OopsDemo {
	 private static final Logger logger = LogManager.getLogger(OopsDemo.class);
	public static void main(String[] args) {
		
//		System.out.println("Oops Demo");
		
		
		for(int i=0;i<100;i++){
			logger.debug("Hello from Log4j 2");
			
			logger.info("test");
		}
		
		
		try {
            System.out.println(getData());
        } catch (IllegalArgumentException e) {
            logger.error(e);
        }

	}
	
	 static int getData() throws IllegalArgumentException {
	        throw new IllegalArgumentException("Sorry IllegalArgumentException!");
	    }

}
