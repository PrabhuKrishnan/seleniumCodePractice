package com.pom.methodChaining;

public class HomePage {
	
	
	public HomePage()
	{
		
	}
	
	public HomePage verifyHomepageTitle()
	{
		System.out.println("HomePage title from HomePage page");
		return this;
	}
	
	public LoginPage clickLoginPageButton()
	{
		System.out.println("LoginPage button clicked from the homepage");
		return new LoginPage();
	}

}
