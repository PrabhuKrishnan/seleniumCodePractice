package com.java.lambdaEXpression.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
 * predicate --> accepts one parameter and return boolean as a result 
 * use only if you have conditional checks and it returns the Boolean value
 * 
 * 
 */




public class PredicateInterface {

	public static void main(String[] args) {

		//Example 1
		Predicate<Integer> pr = n->(n>20);
		
		System.out.println(pr.test(50));
		
		//Example 2
		Predicate<String> string = s->(s.length()>4);
		
		System.out.println(string.test("prabhu"));
		System.out.println(string.test("pk"));

		//Example 3: using array
		String[] names = {"prabhu","krishnan","ram","janu","jeni"};

		System.out.println("Predicate using array of values");
		
		for (String name : names) 
		{
			//predicate method test is invoked
			if (string.test(name)) //condition is true(boolean)
			{
				System.out.println(name);
			}
		}
		
		
		//Example 4: using Arraylist
		System.out.println();
		System.out.println("Using Array List: ");
		
		ArrayList<String> cam = new ArrayList<>();
		cam.add("canon");
		cam.add("sony");
		cam.add("apple");
		cam.add("samsung");
		
		Predicate<String> pc = c->(c.length()>2);
		
		for (String string2 : cam) 
		{
			if(pc.test(string2))
			{
				System.out.println(string2);
			}
		}
		   

	}

}















