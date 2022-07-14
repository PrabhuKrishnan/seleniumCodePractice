package com.java.lambdaEXpression.function;

import java.util.function.Function;

public class FunctionInterface {
	
	public static void main(String[] args) {
		
		//fucntion<dataType, ReturnType>
		System.out.println("Using Integer as a datatype and return type:");
		
		Function<Integer, Integer> f = n->n*n;
		System.out.println(f.apply(10));
		
		//it accepts string as an argument and return the length as Interger
		System.out.println("Using String as a dataType and Integer as Return type:");
		
		Function<String, Integer> str = s->s.length();
		System.out.println(str.apply("prabhu"));
		
		
		
		
		
	}

}
