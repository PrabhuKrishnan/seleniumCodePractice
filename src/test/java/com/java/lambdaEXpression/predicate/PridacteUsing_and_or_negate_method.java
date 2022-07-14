package com.java.lambdaEXpression.predicate;

import java.util.ArrayList;

import com.google.common.base.Predicate;

public class PridacteUsing_and_or_negate_method {

	public static void main(String[] args) {


		
		/*
		 * Methods in predicate
		 * test()
		 * and()
		 * or()
		 * not()
		 * negate()
		 * isEqual()
		 *
		 * 
		 * 
		 */
		
		
		//joining predicates -  add, or,negate   

		int[] a = {100,2,7,4,8,10,20,50,52,54,56,58,60};

		Predicate<Integer> p1 = i->i%2==0;
		Predicate<Integer> p2 = i->i>50;

		//and in predicate 
		System.out.println("Using and method in predicate");
		System.out.println("Follwoing numbers are EVEN & GREATERN than 50");

		//System.out.println("test: " + p1.and(p2).test(a[0]));

		for (int j : a) 
		{
			//and method - 
			if(p1.and(p2).test(j)) //returns boolean value true
			{
				System.out.println(j);
			}
		}

		System.out.println();
		System.out.println("Using or method in Predicate");

		//or in predicate 
		System.out.println("Follwoing numbers are EVEN & GREATERN than 50");

		for (int j : a) 
		{
			if(p1.or(p2).test(j))
			{
				System.out.println(j);
			}
		}


		System.out.println();

		//negate in predicate - it will 
		System.out.println("using negate method in predicate:");

		for (int j : a)
		{
			if(p1.negate().test(j))
			{
				System.out.println(j);
			}
		}
		
		
		ArrayList<String> sNames = new ArrayList<>();
		sNames.add("prabhu");
		sNames.add("venkat");
		sNames.add("Ram");
		sNames.add("janu");
		sNames.add("bala");
		
		System.out.println();
		System.out.println("Predicate Using ArrayList:");
		
		Predicate<String> s = n->(n.length()>4);
		
		for (String filterNames : sNames) {
			
			if(s.test(filterNames))
			{
				System.out.println(filterNames);
			}
			
		}
		



















	}	

}
