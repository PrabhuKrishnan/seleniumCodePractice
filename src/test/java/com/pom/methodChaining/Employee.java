package com.pom.methodChaining;

public class Employee {

	private String eId;
	private String eName;
	private String companyName;

	Employee(String eId,String eName, String companyName)
	{
		this.eId=eId;
		this.eName=eName;
		this.companyName=companyName;
	}
	
	public String  geteName() {
		return eName;
	}
	 
	public String getCompanyName() {
		return companyName;
	}
 
	public String geteId() {
		return eId;
	}

	 
	
}
