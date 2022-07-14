package com.pom.methodChaining;

public class EmployeeBuilder {


	private String eId;
	private String eName;
	private String companyName;
	
	private EmployeeBuilder()
	{
		
	}

	public static EmployeeBuilder builder()
	{
		return new EmployeeBuilder();
	}
	
	public EmployeeBuilder seteId(String eId) {
		this.eId=eId;
		return this;
	}
	public EmployeeBuilder setEname(String eName ) {
		this.eName=eName;
		return this;

	}
	public EmployeeBuilder SetCompanyName(String companyName) {
		this.companyName=companyName;
		return this;
	}

	public Employee perform()
	{
		return new Employee(eId,eName,companyName);
	}





}
