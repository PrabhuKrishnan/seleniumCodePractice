package com.pom;

public class ProductPage {
	
	
	ProductPage getProductPageTitle()
	{
		
		System.out.println("PrductPage");
		return this;
	}

	public CartPage navigateToCartPage()
	{
		return new CartPage();
	}
	
}
