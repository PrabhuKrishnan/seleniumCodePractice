package com.javastreams.filterMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {


		List<String> names = Arrays.asList("prabhu","krishnan","Suja","Ram","Janu");
		
		List<String> list = new ArrayList<>();

		System.out.println("Processing and storing in list");
		list=names.stream().filter(n->n.length()>2 && n.length()>3).collect(Collectors.toList());
		System.out.println(list);

		System.out.println("Processing and printing its result");
		names.stream().filter(n->n.length()>2 && n.length()>3).forEach(n->System.out.println(n));

		System.out.println("Another way of usnig the lambda");
		names.stream().filter(n->n.length()>2 && n.length()>3).forEach(System.out::println);



	}

}
