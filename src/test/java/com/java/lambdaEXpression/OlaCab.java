package com.java.lambdaEXpression;

@FunctionalInterface
interface Cab1
{
   //not returning but accepting two parameters 
   public void bookCab(String from, String to);
   
}

public class OlaCab {

	public static void main(String[] args) {
		
		//metioned the parameter, no need to mention the datatype
		//the lambda refer the data type from abstract method
		Cab1 cab1 = (from,to)->System.out.println("Ola Cab booked from"+ from +" to"+ to);
		cab1.bookCab("chennai", "Delhi");
		 
	}
}
