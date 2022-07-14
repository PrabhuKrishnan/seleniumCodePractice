package com.javastreams.filterMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StereamFilterNullCheck {
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("animals",null,"birds","tigers",null,"elephants");
		List<String> result=new ArrayList<>();
		
		result = words.stream()
				.filter(w->w!=null)
				.collect(Collectors.toList());
		
		System.out.println(result);
		
		
		
	}

}
