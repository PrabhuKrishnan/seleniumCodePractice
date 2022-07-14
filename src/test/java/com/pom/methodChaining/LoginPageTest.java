package com.pom.methodChaining;

public class LoginPageTest {

	public static void main(String[] args) {
		
		
		HomePage homePage = new HomePage();
		
		  homePage.verifyHomepageTitle()
		.clickLoginPageButton()
		.verifyLoginPageTitle()
		.Login("prabhu", "prabhu")
		.verifyAccountDetailsPageTitle()
		.build();
		 
	 
	}
	
}
