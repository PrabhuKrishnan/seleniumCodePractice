package com.pom;

public class PaymentPage {


	public PaymentPage  getPaymentPageTitle()
	{
		System.out.println("Payment Page Title");
		return this;
	}


	public void getPaymentStatus()
	{
	 
		System.out.println("Payment success");

	}

	public LoginPage navigateToLoginPage()
	{
		return new LoginPage();
	}
	
	
}
