package com.javastreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,12,20,22,30,33,40,44,50,53,60,63,70,73,80,83,90,93,100);
		List<Integer> evenNumbers = new ArrayList<Integer>();
		
		/*
		 * stream are used to process the data from the collections
		 * Then from the stream, use filter method to perform some operation and its a predicate and it return the boolean value 
		 * Then use the collect method to store the processed result in the list 
		 * 
		 */
		//evenNumbers = list.stream().filter(n->n%2==0).collect(Collectors.toList());
		//System.out.println(evenNumbers);
		
		
		//print the result from stream to the consle insteam of storing into the list
		//foreach is a consumer and it accept the value and wont return any value 
		//list.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		//another way of replacing the lambda expression
		list.stream().filter(n->n%2==0).forEach(System.out::println);
		
		
		
		
		
	}
 
}
