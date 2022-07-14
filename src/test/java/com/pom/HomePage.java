package com.pom;

public class HomePage {


	public HomePage getHomePageTitle()
	{
		System.out.println("Home Page...");
		return this;
	}


	public HomePage getProductType()
	{
		System.out.println("Get Product Type");
		return this;
	}

	public ProductPage navigateToProductPage()
	{

		return new ProductPage();

	}


}
