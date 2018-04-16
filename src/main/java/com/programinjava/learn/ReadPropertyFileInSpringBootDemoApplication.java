package com.programinjava.learn;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReadPropertyFileInSpringBootDemoApplication  implements CommandLineRunner	{

	@Resource
	ReadPropertyFileClass readPropertyFileClass;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ReadPropertyFileInSpringBootDemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		readPropertyFileClass.showPropertyKeyValue();
		
	}
}
