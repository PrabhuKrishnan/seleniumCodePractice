package com.selenium.testngExample;

import org.testng.annotations.Test;

public class MultipleTestCaseExecution {

	@Test(priority = 1 , enabled=true) //enabled = true, will  execute the test case
	
	public void a_test()
	{
		System.out.println("a_tets");
	}
	
	
	@Test(priority = 10, enabled=true) 
	
	public void c_test()
	{
		System.out.println("c_tets");
	}
	
	
	@Test(priority = 2, enabled = false) //enabled = false, will  skip the test case
	
	public void b_test()
	{
		System.out.println("b_tets");
	}
	
	
		
	}
	
	

