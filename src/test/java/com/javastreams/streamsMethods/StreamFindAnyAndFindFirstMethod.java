package com.javastreams.streamsMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFindAnyAndFindFirstMethod {
	
	public static void main(String[] args) {
		
		
		List<String> words = Arrays.asList("birds","light","color","animal");
		
		//NoSuchElement Exception occurs if there no elements in the list
		//findAny Method
		Optional<String> findAnyValue =words.stream().findAny();
		
		System.out.println(findAnyValue.get());
		
		//findFirst Method
		Optional<String> findFirstValue = words.stream().findFirst();
		System.out.println(findFirstValue.get()); 
		
		//concat method 
		List<String> l1 = Arrays.asList("prabhu","krishnan","venkat");
		List<String> l2 = Arrays.asList("ram","janu","karthick");
		
		Stream<String> s1 = l1.stream();
		Stream<String> s2 = l2.stream();
		
		List<String> streamConcat = Stream.concat(s1, s2).collect(Collectors.toList());
		
		System.out.println("stream concat: "+streamConcat);
	
	}

}
