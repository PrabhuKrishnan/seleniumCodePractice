package com.selenium.testngExample;

import org.testng.annotations.Test;

public class TestPriority {

	@Test(priority = 1)
	public void a_test()
	{
		System.out.println("a_tets");
	}
	
	@Test(priority = 10)
	public void b_test()
	{
		System.out.println("b_tets");
	}
	
	@Test(priority = 2)
	public void c_test()
	{
		System.out.println("c_tets");
	}
	
	
}
