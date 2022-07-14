package com.selenium.locators;


interface Action
{

	public void perform();
	

}

class ActionBuilderTest implements Action
{

	@Override
	public void perform() {
		 
		System.out.println("performTest");
		build();
	}
	
	 
	
	public  Action  build()
	{
		System.out.println("from build method..");
		return this;
	}

}


public class Demo {

	
	public static void main(String[] args) {
		
	}
	
}
