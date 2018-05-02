package com.att.digicustomer.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import com.att.digicustomer.AuthenticateUser;
import com.att.digicustomer.ProductDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AuthenticationAction extends ActionSupport {
	private static Properties props = null;
	private String userId;
	private String password;
	private HashMap<String,Object> productManagerHM;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String validateAccess() throws IOException {

		System.out.println("User validation");
		System.out.println(userId + " / " + password);
		AuthenticateUser userValidation = new AuthenticateUser();
	
		
		ProductDAO productDAO = new ProductDAO();
		
		productManagerHM = (HashMap<String, Object>)productDAO.retrieveProducts();
		System.out.println("Hashmap size : "+productManagerHM.size());
		
		if (userValidation.validateUser(userId, password)) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

	public String relogin() throws IOException {

		System.out.println("Relogin Action");

		return SUCCESS;

	}
}
