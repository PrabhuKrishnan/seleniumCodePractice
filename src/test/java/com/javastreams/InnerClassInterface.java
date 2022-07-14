package com.javastreams;



//The annotation @FunctionalInterface used to denote that the interface would have only one functional interface method 
//Here displayDaya() is an functional interface method 
//From java 1.8, the interface can have the default and static method with the method implementation 
//if the interface have only one method then it called the functionla interface 
//with that only we can use this in java lambda expression
@FunctionalInterface
public interface InnerClassInterface {
	
	public boolean print(String a); //by defalut it's public abstact method 
}
