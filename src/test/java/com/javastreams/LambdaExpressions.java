package com.javastreams;

import java.util.function.Consumer;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		
		stringOperations((s)->System.out.println(s.toUpperCase()));
		stringOperations((s)->System.out.println(s.toLowerCase()));
		stringOperations((s)->System.out.println(s.length()));
		
		
	}

	static void stringOperations(Consumer<String> consumer) 
	{
		String name="Prabhu KRISHNAN";
		consumer.accept(name);
		
	}
}
