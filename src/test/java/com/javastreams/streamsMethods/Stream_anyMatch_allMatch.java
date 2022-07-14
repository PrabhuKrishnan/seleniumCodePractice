package com.javastreams.streamsMethods;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

public class Stream_anyMatch_allMatch {
	
	//anyMatch
	//allMatch
	//noneMatch
	
	public static void main(String[] args) {
		
		Set<String> data = new HashSet<>();
		data.add("one");
		data.add("one");
		data.add("two");
		data.add("three");
		data.add("four");
		//data.add("two");
		
		//anyMatch
		boolean result = data.stream().anyMatch(d->
		{
			
			return d.startsWith("one");
		});
		
		System.out.println("AnyMatch: "+ result);
		
		result = data.stream().allMatch(d->
		{
			return d.startsWith("one");
		});
		
		System.out.println("AllMatch: "+ result);
		
		
		result = data.stream().noneMatch(d->
		{
			
			return d.startsWith("onee");
			
		});
		System.out.println("noneMatch: "+ result);
	}

}
