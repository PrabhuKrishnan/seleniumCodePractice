package com.java.lambdaEXpression.predicate;

import java.util.function.Predicate;

public class PredicateTest {
	
	public static void main(String[] args) {
		
		
		
		Predicate<String> pr = s->(s.length()>2);
		System.out.println(pr.test("prabhu"));
		
		
	}


}
