package com.javastreams.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMap {
 public static void main(String[] args) {

	 
	//use flatMap for complex collection data
	//flatMap method will process the streams of  objects and will return the data into one list
	 
	//Example 1:
    List<Integer> list1 = Arrays.asList(1,2);
    List<Integer> list2 = Arrays.asList(3,4);
    List<Integer> list3 = Arrays.asList(5,6);
    
    //adding three list into one list
    List<List<Integer>> allList = Arrays.asList(list1,list2,list3);
    
    List<Integer> res = new ArrayList<>();
    
    res = allList.stream()
    		.flatMap(s->s.stream())
    		.map(n->n+10)
    		.collect(Collectors.toList());
    
    System.out.println(res);
    
   //Example 2: 
   List<String> teamA = Arrays.asList("prabhu","krishnan");
   List<String> teamB = Arrays.asList("venkat","bala");
   List<String> teamC = Arrays.asList("raj","vaira");
   
   
   List<List<String>> finalTeam =Arrays.asList(teamA,teamB,teamC); 
   
   List<String> newTeam = new ArrayList<>();
   
   newTeam = finalTeam.stream()
		   .flatMap(s->s.stream())
		   .collect(Collectors.toList());
   
   System.out.println(newTeam);
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	 
}
}
