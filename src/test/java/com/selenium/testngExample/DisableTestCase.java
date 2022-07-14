package com.selenium.testngExample;

import org.testng.annotations.Test;

public class DisableTestCase {

	//use enabled to disable   the test case

	@Test(enabled=true) //enabled = true, will  execute the test case
	public void a_test()
	{
		System.out.println("a_tets");
	}


	@Test( enabled=true) 
	public void c_test()
	{
		System.out.println("c_tets");
	}


	@Test(enabled = false) //enabled = false, will  skip the test case
	public void b_test()
	{
		System.out.println("b_tets");
	}

}
