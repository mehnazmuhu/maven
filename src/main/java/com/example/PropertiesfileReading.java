package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesfileReading {

	public static String firoza(String key) throws IOException {
		
		Properties prop = new Properties();
		
		String filepath=System.getProperty("user.dir")+"//src//test//resources//configuration//develop.properties";
		
		FileInputStream file = new FileInputStream(filepath);
		
		prop.load(file);
		
	
		String value=prop.getProperty("browsertype");
		return value;
	}
}
