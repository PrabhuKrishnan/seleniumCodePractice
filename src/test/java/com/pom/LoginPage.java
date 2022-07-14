package com.pom;

class LoginPage {

	LoginPage setUserName() {
		System.out.println("UserName");
		return this;
	}

	LoginPage setPassword() {
		System.out.println("pasword");
		return this;
	}

	
	
	public HomePage navigateToHomePage() {

		return new HomePage();
	}
}

 
 