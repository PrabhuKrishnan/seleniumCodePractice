package com.pom.methodChaining;

public class Demo {

	public static void main(String[] args) {


		StringBuilder sb = new StringBuilder("Java"); 
		
		// Below line uses method chaining technique
		sb.insert(0,"Learn ").append(" on refresh java").append(" tutorial");   
		System.out.println(sb);     
		
		// Below line also uses method chaining technique
		String str = sb.substring(14).replace(" tutorial", "").toUpperCase(); 
		System.out.println(str);  


	}
}
