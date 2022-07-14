package com.java.lambdaEXpression;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import com.google.common.base.Predicate;

public class LambdaFunctionalInterfaceTest {

	/*
	 * predicate -> one parameter and returns boolean value
	 * function -> input as dataType1 and return the value as dataType2
	 * consumer ->won't accept any data but return the data 
	 * supplier ->
	 */
	
	/*
	 * scenario
	 * List of strings 
	 * predicate -> len >4
	 * function -> string,length -> get element in the list and return the length
	 * consumer -> print the result 
	 * supplier - wont accept any data but it return the value
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		
		ArrayList<String> words = new ArrayList<>();
		words.add("SONY");
		words.add("CANON");
		words.add("APPLE");
		words.add("SAMSUNG");
		
		Function<String,Integer> f = w->(w.length());  
		
		Predicate<Integer> p = n->(n>4);
		
		Consumer<String> c = (w)->
		{
			System.out.println(w);
		};
		
		Supplier<String> s = ()->{return "Functional Interface Implemented successfully";};
		
		for (String word : words) {
			
			  int len = f.apply(word); //Invoked function interface
			  
			  if(p.test(len))  //Invoked perdicate Interface
			  {
				   c.accept(word); //Invoked consumer
			  }
		}
		 System.out.println(s.get()); //Invoked supplier
		
		
	}
	
}
