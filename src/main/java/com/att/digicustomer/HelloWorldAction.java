package com.att.digicustomer;

public class HelloWorldAction {
	   private String name;

	   public String execute() throws Exception {
			System.out.println("Test"+name);
	      return "success";
	   }
	   
	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
	}