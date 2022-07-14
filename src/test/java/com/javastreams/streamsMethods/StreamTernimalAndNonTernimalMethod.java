package com.javastreams.streamsMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTernimalAndNonTernimalMethod {
 
	public static void main(String[] args) {
		
		
		//Non-Terminal methods
		//distinct()
		//limit()
		
		//terminal Methods
		//count
		//foreach
		
		List<String> camera = Arrays.asList("canon","sony","apple","samsung","canon","apple");
		List<String> list =  new ArrayList<>();
		
		//distinct method - to avoid duplicate
		
		List<String> distinctList =camera.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(distinctList);
		
		//limit method - to limit the data from the list 
		camera.stream()
			.limit(3)
			.forEach(l->System.out.println(l));
		
		long count =camera.stream().distinct().count();
		System.out.println(count);
		
		
		
		
	}

}
