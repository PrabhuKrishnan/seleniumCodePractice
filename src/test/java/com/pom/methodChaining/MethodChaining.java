package com.pom.methodChaining;

class CanonEmp
{
	private String eName;
	private int eId;

	CanonEmp( )
	{
	}

	public CanonEmp seteName(String eName) {
		this.eName=eName;
		return this;
		 
	}
 
	public CanonEmp seteId(int eId) {
		 this.eId=eId;
		 return this;
	}
	
	public void displayEmpDetails()
	{
		System.out.println("eName: " +eName+" eId: " + eId);
	}
	


}

public class MethodChaining {

	public static void main(String[] args) {
		 
		CanonEmp emp=  new CanonEmp();
		emp.seteName("prabhu")
		.seteId(100)
		.displayEmpDetails();
		
	 
		
		
	}

}








 




