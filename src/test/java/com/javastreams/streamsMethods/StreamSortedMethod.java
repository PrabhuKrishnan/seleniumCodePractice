package com.javastreams.streamsMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedMethod {
	
	
  public static void main(String[] args) {
	
	  
	  List<Integer> data = Arrays.asList(1,2,3,9,8,12,15,45,66,5,7);
	  
	 List<Integer> ascendingSort =  data.stream()
			 	.sorted()
			 	.collect(Collectors.toList());
	 
	 System.out.println(ascendingSort);
	 
	 List<Integer> descendingOrder =data.stream()
			 .sorted(Comparator.reverseOrder())
			 .collect(Collectors.toList());
	 
	 System.out.println(descendingOrder);
	  
	 
	 List<String> names = Arrays.asList("prabhu","raju","sanju","babu","vijay","kamesh");
	 
	 List<String> sorted = names.stream()
			 .sorted()
			 .collect(Collectors.toList());
	 
}

}
