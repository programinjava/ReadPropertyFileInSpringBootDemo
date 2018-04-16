package com.programinjava.learn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReadPropertyFileClass {
	
	@Value("${propertykey1}")  // this annotation is used to read the property file value in spring boot
	String propertyKey;
	
	public void showPropertyKeyValue() {
		System.out.println("The Value of Property File key is "+propertyKey);
	}

}
