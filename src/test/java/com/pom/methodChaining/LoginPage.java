package com.pom.methodChaining;

public class LoginPage {

	private String userName;
	public String password;
	
	public LoginPage()
	{
		
	}
	
	public LoginPage verifyLoginPageTitle()
	{
		System.out.println("LoginPage title verified");
		return this;
		
	}
	
	public AccountDetailsPage Login(String userName,String password)
	{
		System.out.println("UserName and Password is entered..");
		this.userName=userName;
		this.password=password;
		return new AccountDetailsPage();
	}
	
	 
	
	
	
}
