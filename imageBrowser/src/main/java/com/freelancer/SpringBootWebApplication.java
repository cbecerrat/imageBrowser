package com.freelancer;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebApplication {
	private static final String SEPARADOR = "===============================================================================================";
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootWebApplication.class, args);
		System.out.println(SEPARADOR);
		System.out.println("SYSTEM STARTED...");
		System.out.println(SEPARADOR);
		
		String fileSeparator = File.separator;
		Runtime.getRuntime().exec(System.getProperty("user.dir").concat(fileSeparator).concat("page.bat"));
	}	
}