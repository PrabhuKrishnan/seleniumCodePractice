package com.javastreams;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Javastreams {

	 
	//@Test
	public void getNames()
	{
		//count the number of names starting with alphabet A in list 
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("Abi");		
		name.add("Abiram");
		name.add("karhtick");
		name.add("ram");
		name.add("Aarthi");	
		
		int count=0;
		
		for(int i=0;i<name.size();i++)
		{
			
			String getNames = name.get(i);
			 
			if(getNames.startsWith("A"))
			{
				count++;
			}
			
		}
		
		System.out.println(count);
		
	}
	
	@Test
	public void streamFilter() 
	{

		ArrayList<String> name = new ArrayList<String>();
		name.add("Abi");		
		name.add("Abiram");
		name.add("karhtick");
		name.add("ram");
		name.add("Aarthi");	
		
		/*
		 Steps to apply the streams 
		 1.Apply the variable with streams
		 2.Use the filter method to perform the specific operation 
		 3.Create the variable in the filter method 
		 4.And with that variable call the string operations method
		 5.It returs result as Long data type (in streams) 
		 
		 */
		
		long getNameCount = name.stream().filter(s->s.startsWith("A")).count();
		
		System.out.println(getNameCount);
		
		long nameList = Stream.of("raju","ramu","radha","ram","raj").filter(s->
		{
			return s.startsWith("r");
			
		}).count();
		
		System.out.println("count from stream collection: " + nameList);
		
		//name.stream().filter(s->s.length()>4).forEach(s->System.out.println("name greater than length 4: " + s));
		name.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		
	}
	
	@Test
	public void streamMap()
	{
		//In streams, the filter method used to filter the elements based on the given condition in the given list 
		//Based on the filtered result, one can perform the operations like sort 
		//and then print the result 
		
		//change the strings to uppercase using streams 
		Stream.of("raja","priya", "prabhu","venkat") //list of names is added to stream
		.filter(s->s.endsWith("a")) //filtering the name with condition and this is an intermediate operation
		.map(s->s.toUpperCase()) //filetered result is given to the map and this is an intermedaite operation 
		.forEach(s->System.out.println(s)); //terminal operation, used to print the result 
		
		//sort and change the name list to upper case  using arrayList in streams 
		List<String> names = Arrays.asList("abi,","aarhi","archana","amy","anand","aaradha","angel","agent","agal");
		 names.stream()
		.filter(s->s.startsWith("a"))
		.sorted() //stateful ternimal operation
		.map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		
	}
	
	@Test
	public void sortListUsingStream()
	{
		
		//mereging two list using streams
		ArrayList<String> list1= new ArrayList<String>();
		list1.add("birds");
		list1.add("animals");
		list1.add("reptails");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("wetlands");
		list2.add("rainforest");
		list2.add("desert");
		
		//change the list to stream when concat and then store it as streams
		Stream<String> newStream =Stream.concat(list1.stream(), list2.stream());//concat two list 
		//newStream.sorted().forEach(s->System.out.println(s));
		//anyMatch method is used to search any element in list
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("rainforest"));
		System.out.println(flag);
		Assert.assertTrue(flag);//to verfiy the result
		
	}
	
	@Test
	public void streamCollectMethod()
	{
		
		List<String> list = Stream.of("aaprabhu","abvaira","acbala","karthick")
		.filter(s->s.startsWith("a"))
		.sorted()
		.collect(Collectors.toList());
		System.out.println(list.get(0));
		
	}
	
	
	@Test
	public void printUniqueNumbersUsingStreams()
	{
		
		List<Integer> value = Arrays.asList(9,1,1,4,5,4,7,3,3);
		
		value.stream()
		.distinct()
		.sorted()
		.forEach(s->System.out.println(s));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

