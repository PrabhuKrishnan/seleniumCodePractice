package com.selenium.testngRetryLogic;

import org.testng.Assert;
import org.testng.annotations.Test;




public class RetyAnalyzerTest {
	
	//if we have more test, its not a good approach to use the retryAnalyzer attribute, to overcome this, 
	//we need to implement the IAnnotationTransformer(to retry at runtime) interface
	
	@Test
	public void test1()
	{
		Assert.assertEquals(false, true);
		//System.out.println("test1");
	}
	
	@Test 
	public void test2()
	{
		Assert.assertEquals(false, true);
		//System.out.println("test2");
	}


}
