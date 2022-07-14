package com.java.lambdaEXpression;

@FunctionalInterface
interface Cab
{
	//void, not return value
	public void bookCab();
}

public class Test {

	public static void main(String[] args) {
		
		//bookCab doesn't have any parameter and return type
		Cab cab = ()->System.out.println("Ola cab is booked");
		cab.bookCab();
	}
}
