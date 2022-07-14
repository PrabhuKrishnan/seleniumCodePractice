package com.javastreams;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		Map<Integer, String> dataMap = new HashMap<>();
		dataMap.put(1,"prabhu");
		dataMap.put(2,"krishnan");
		dataMap.put(3,"venkat");
		dataMap.put(4, "bala");
		
		//Get Key and value using the entryset 
		for (Entry<Integer, String> entry : dataMap.entrySet()) {
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}
		
		System.out.println();
		//using the keyset read the key and value
		System.out.println("from keyset");
		for (Integer key : dataMap.keySet()) {
			System.out.println(dataMap.get(key));
		}
		System.out.println();
		
		//using java8
		dataMap.forEach((k,v)->System.out.println(k+" : " +v)); //to print key and value
		
		System.out.println();
		System.out.println("From Key Set JAVA8: ");
		dataMap.keySet().forEach(k->System.out.println(k+" : "+dataMap.get(k)));
	}
	

}
