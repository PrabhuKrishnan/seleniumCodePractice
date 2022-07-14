package com.selenium.webtable;

public class Demo {

	public static void main(String[] args) {
		
		String a = "+ 2.11";
		
		String[] s = a.split("[+-]");
		System.out.println(s[1].trim());
		
	}
}
