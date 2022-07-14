package com.javastreams.streamsMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamCountMinMaxMethod {
	public static void main(String[] args) {


		//count Method
		List<Integer> eNumbers = Arrays.asList(1,3,4,5,5,6,7,12,13,15);

		long count = eNumbers.stream()
					.filter(e->e%2==0)
					.count();
		
		System.out.println(count);

		//min method 
		Optional<Integer>minValue = eNumbers.stream().min((v1,v2) ->
		{
			return v1.compareTo(v2);
		});

		System.out.println(minValue.get());

        //max method
		Optional<Integer> maxValue =   eNumbers.stream().max((v1,v2)->{
			return v1.compareTo(v2);
		});

		System.out.println(maxValue.get());

	}

}
