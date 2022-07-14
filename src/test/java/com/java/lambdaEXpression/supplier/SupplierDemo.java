package com.java.lambdaEXpression.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[] args) {
		
		//supplier won't accept any parameter but it return the data
		Supplier<Date> s = ()->new Date();
		System.out.println(s.get());		
	}

}
