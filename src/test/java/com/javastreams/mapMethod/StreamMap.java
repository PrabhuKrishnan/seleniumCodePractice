package com.javastreams.mapMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {



	public static void main(String[] args) {

		List<String> camera =  Arrays.asList("canon","sony","alpha","mirroless");
		List<String> upperCase = new ArrayList<>();

		//Example 1:
		System.out.println("coverting string to upper case using map method: ");

		upperCase = camera.stream()
				.map(c->c.toUpperCase())
				.collect(Collectors.toList());

		System.out.println(upperCase);

		//Example 2:
		System.out.println("finding length of the string using map method: ");

		List<String> list1 =  Arrays.asList("canon","sony","alpha","mirroless");
		
		list1.stream()
		.map(n->n.length())
		.forEach(len->System.out.println(len));


		//Example 2:
		System.out.println("arthmetic calculations using map");

		List<Integer> numbers= Arrays.asList(2,3,4,5,6);
		List<Integer> result= new ArrayList<>();

		result = numbers.stream()
				.map(num->num*3)
				.collect(Collectors.toList());
		
		System.out.println(result);

		numbers.stream().map(num->num*3).forEach(num->System.out.println(num));
		numbers.stream().map(num->num*3).forEach(System.out::println);




















	}

}
