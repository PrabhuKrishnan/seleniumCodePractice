package com.javastreams.streamsMethods;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceAndToArrayMethod {
	
	public static void main(String[] args) {
		
		List<String> data = Arrays.asList("A","B","C","D","1","2","3","4","5");
		
	//reduce method - used to combine the collection object into one
	Optional<String> reducedData = data.stream().reduce((value, combinedValue)->{
				return  value+combinedValue;
		});
		
		System.out.println(reducedData.get());
		
		
		Object[] arr = data.stream().toArray();
		
		for (Object object : arr) {
			System.out.println(object);
		}
		
		
		
	}
	

	
	
	
	

}
