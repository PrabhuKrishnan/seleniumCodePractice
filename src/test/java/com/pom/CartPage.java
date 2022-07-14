package com.pom;

public class CartPage {
	
	
	
	
	public CartPage checkCartPage()
	{
		
		System.out.println("checkCartPage");
		return this;
	}
	
	public PaymentPage navigateToPaymentPage()
	{
		return new PaymentPage();
	}

}
