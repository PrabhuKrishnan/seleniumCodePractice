package com.javastreams;

public class InnerClassTest {
	
	 public static void main(String[] args) {
		
		//using the lambda expression, define the Anonynous Inner Class like below
		 //Steps in Functional Programming 
		 //1.Parameter the abstract method and your lambda expression 
		 //2.Return type 
		 //3.Only one abstract or unimplemented method
		 
		 InnerClassInterface i1 = a->a.length()>0;
		 System.out.println(i1.print("PRABHUKRISHNAN"));
	}
}
