package com.selenium.testngExample;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	
	@Test(invocationCount=10,invocationTimeOut=1)
	public void sum()
	{
		int a=10;
		int b=20;
		int c=30;
		System.out.println("Sum is==="+(a+b+c));
		
	}

}
