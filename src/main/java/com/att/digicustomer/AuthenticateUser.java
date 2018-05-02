package com.att.digicustomer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class AuthenticateUser {

	
public boolean validateUser(String userName, String password) throws IOException{
		InputStream inputStream = null;
		boolean isValidUser= false;
		HashMap<String,String> users = new HashMap<String,String>();
		
		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";
 
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
 
			users.put(prop.getProperty("user1"), prop.getProperty("password1"));
			users.put(prop.getProperty("user2"), prop.getProperty("password2"));
  
			
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}

		
		if(users.containsKey(userName) && users.get(userName).equals(password)){
			isValidUser = true;
		}		
		
		return isValidUser;
		
	}
}
