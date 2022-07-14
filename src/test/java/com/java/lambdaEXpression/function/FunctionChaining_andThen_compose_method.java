package com.java.lambdaEXpression.function;

import java.util.function.Function;

public class FunctionChaining_andThen_compose_method {

	//Function Chaining using the - andThen and compose method in functional interface
	
	public static void main(String[] args) {
			
		Function<Integer, Integer> f1 = n->n*2;
		Function<Integer, Integer> f2 = n->n*n*n;
		
		//calculate f1 with the value 2 and the f1 result is calculated with f2
		System.out.println(f1.andThen(f2).apply(2)); //calculate f1 first and then f2
		
		//f2 is calculated with value 10 and then result of f2 is calculated with f1
		System.out.println(f1.compose(f2).apply(10));//calculate f2 first and then f1
		
				
		
		
		
	}

}
