package com.java.lambdaEXpression;





//two parameters and returning the values
@FunctionalInterface
interface Cab3
{
   //abstract method which accepts two string arguments and return as string value
   public String bookCab(String from, String to);
   
}

public class OlaCabReturnValues {

	public static void main(String[] args) {

		//if there is more then one line, then in lambda expression should be mentiod in {} braces
		Cab3 cab3 = (from,to)->
		{
			
		  System.out.println("Ola Cab booked from " +from+" to"+ to);
		  return("price:Rs,5000");
			
		};
		System.out.println(cab3.bookCab("chennai", "Delhi"));
	}
}
