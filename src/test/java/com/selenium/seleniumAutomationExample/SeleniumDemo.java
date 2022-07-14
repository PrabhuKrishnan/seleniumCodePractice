package com.selenium.seleniumAutomationExample;



class links
{
	
	public void display()
	{
		System.out.println("Parent Class");
	}
}


class camera extends links
{

	public void info()
	{
		System.out.println("Child Class");
	}
	
}


public class SeleniumDemo {

	
	public static void main(String[] args) {
		 
		camera c = new camera();
		c.display();
		c.info();

	}

}
