package com.selenium.testngExample;

import org.testng.annotations.Test;

public class ExpectedExceptions {

	//if we mention the expectedExceptions attribute then the test case won't fail
	@Test(expectedExceptions = NumberFormatException.class)
	public void d_test() throws NumberFormatException
	{
		/*System.out.println("d_tets");
		String s ="100";
		int value = Integer.parseInt(s);
		System.out.println(value);
		*/
		
		throw new NumberFormatException();
		
		
}
	
}
