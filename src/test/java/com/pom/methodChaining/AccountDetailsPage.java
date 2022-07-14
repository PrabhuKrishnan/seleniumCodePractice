package com.pom.methodChaining;

public class AccountDetailsPage {

	
	public AccountDetailsPage()
	{
		//code to call the pagefactory class 
	}
	
	public AccountDetailsPage verifyAccountDetailsPageTitle()
	{
		System.out.println("AccountDetails Page title verified");
		return this;
	}
	
	public HomePage build()
	{
		System.out.println("clickHomePageButton from AccountDetailsPage ");
		return new HomePage();
	}
}
