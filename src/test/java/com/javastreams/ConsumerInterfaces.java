package com.javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaces {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("prabhu","krishnan","venkat");


		//conventational way of iterating the list 
		/*
		for (String string : list) {

			System.out.println(string); 
		}
		*/


		//By using the lambda, this can be achevied using the consumer Interface
		Consumer<String> consumer1 = (s)->System.out.println(s);
		list.forEach(consumer1);

		Consumer<String> consumer2 = (a)->System.out.println(a.toLowerCase());
		Consumer<String> consumer3 = (a)->System.out.println(a.toUpperCase());
		list.forEach(consumer2.andThen(consumer3));

		
		
	}

}
