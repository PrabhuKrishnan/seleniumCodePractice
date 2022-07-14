package com.selenium.testngExample;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {

	
	@Test(timeOut=1000)
	public void a_Test() throws InterruptedException
	{
	
		System.out.println("Test a...");
		
		//this test should finish the execution within time mentioned in timeOut=1000
		//if not it will throw the exception
		Thread.sleep(3000); 
	} 
	
	@Test
	public void b_Test()
	{
	
		System.out.println("Test b...");
	} 
}
