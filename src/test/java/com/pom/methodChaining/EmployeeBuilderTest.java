package com.pom.methodChaining;


public class EmployeeBuilderTest {

	public static void main(String[] args) {

		Employee emp = EmployeeBuilder.builder()
		.seteId("100")
		.setEname("prabhu")
		.SetCompanyName("Apple")
		.perform();
		 








	}

}
